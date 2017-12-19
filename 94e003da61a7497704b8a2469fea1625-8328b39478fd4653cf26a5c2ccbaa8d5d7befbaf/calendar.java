 public static void addShowingToCalendar(Context context, Showing showing) {
        ContentValues event = new ContentValues();
        event.put(CalendarContract.Events.CALENDAR_ID, /*readCalendar(context).get(0)*/2);
        Calendar calendar = DateUtils.utcStringToLocalCalendar(showing.date, DateUtils.FORMAT_DATE_TIME);

        event.put(CalendarContract.Events.TITLE, showing.listing.address);
        event.put(CalendarContract.Events.DESCRIPTION, showing.listing.buyerNotes);

        event.put(CalendarContract.Events.DTSTART, calendar.getTimeInMillis());
        event.put(CalendarContract.Events.DTEND, calendar.getTimeInMillis());
//        event.put(CalendarContract.Events.ALL_DAY, 0);
//        event.put(CalendarContract.Events.HAS_ALARM, 1);

        String timeZone = calendar.getTimeZone().getID();
        event.put(CalendarContract.Events.EVENT_TIMEZONE, timeZone);

        Uri baseUri = Uri.parse(String.valueOf(CalendarContract.Events.CONTENT_URI));

        Uri uri1 = context.getContentResolver().insert(baseUri, event);
        Log.e("data", uri1.toString());
        Log.e("calendar", String.valueOf(event.get(CalendarContract.Events.CALENDAR_ID)));
    }

    public static List<String> readCalendar(Context context) {

        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;

        final String[] EVENT_PROJECTION = new String[]{
                CalendarContract.Calendars._ID,
                CalendarContract.Calendars.CALENDAR_DISPLAY_NAME,
                CalendarContract.Calendars.CALENDAR_COLOR
        };

        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.READ_CALENDAR) == PackageManager.PERMISSION_GRANTED) {
            cursor = contentResolver.query(CalendarContract.Calendars.CONTENT_URI,
                    EVENT_PROJECTION, null, null, null);
        }

        List<String> calendarIds = new ArrayList<String>();

        while (cursor != null && cursor.moveToNext()) {

            final String _id = cursor.getString(0);
            String name = cursor.getString(1);

            Log.v("anim", "Id: " + _id + "---" + name);
            calendarIds.add(_id);
        }
        if (cursor != null) {
            cursor.close();
        }
        return calendarIds;
    }