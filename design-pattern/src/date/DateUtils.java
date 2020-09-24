package date;


public class DateUtils {
    public static void main(String[] args) {
//        TimeZone timeZone = TimeZone.getTimeZone("Asia/Ho_Chi_Minh");
//        System.out.println("timezone: " + timeZone.getOffset(Calendar.ZONE_OFFSET));
//        System.out.println(TimeZone.getDefault());
//
//        Calendar calendar = Calendar.getInstance();
//        System.out.println("Calendaer" + calendar.getTime());
//        calendar.add(Calendar.DATE,  -10);
//        System.out.println("Calender back 10days: " + calendar.getTime());
//        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//        String testDate = format.format(date);
//        System.out.println(testDate);

//        Date date = new Date();
//        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
//        String strdate = format.format(date);
//        System.out.println(format.format(date));
//        try {
//            Long date1 = format.parse(strdate).getTime();
//            System.out.println(date1);
//
//
//        }catch (ParseException e){
//            e.printStackTrace();
//        }
        try{
            System.out.println(50/0);
        }catch (Exception e){
            System.out.println(e.toString());
        }

        System.out.println("test exception");


    }
}
