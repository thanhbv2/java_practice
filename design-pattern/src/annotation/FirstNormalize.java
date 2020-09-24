package annotation;

import java.lang.reflect.Field;

public class FirstNormalize {

        public static void normalize(Employee employee) {
            System.out.println(employee.getClass());
            System.out.println(employee.getClass().getDeclaredFields());
            Field[] fields = employee.getClass().getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                Normalize normalize = fields[i].getAnnotation(Normalize.class);
                if (normalize != null) {
                    try {
                        fields[i].setAccessible(true);
                        if (fields[i].get(employee) != null) {
                            fields[i].set(employee, String.valueOf(fields[i].get(employee)).replaceAll("[^A-Za-z0-9 ]", ""));
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }

    public static void main(String[] args) {
        Employee employee = new Employee("test(8*dkj@#$%s", "nd", "09928");
        normalize(employee);
        System.out.println(employee.getName());
    }
}
