package com.jcfausto.sunshine.app.test;

import android.test.AndroidTestCase;

/**
 * Created by juliocesarfausto on 8/14/14.
 */
public class TestDB extends AndroidTestCase {

    public static final String LOG_TAG = TestDB.class.getSimpleName();

     /*
    public void testCreateDB() throws Throwable {
        mContext.deleteDatabase(WeatherDbHelper.DATABASE_NAME);
        SQLiteDatabase db =
                new WeatherDbHelper(this.mContext).getWritableDatabase();
        assertEquals(true, db.isOpen());
        db.close();
    }


    public void testInsertReadDB() {
        String testName = "North Pole";
        String testLocationSetting = "99705";
        double testLatitude = 64.772;
        double testLongitude = -147.355;

        WeatherDbHelper dbHelper =
                new WeatherDbHelper(mContext);

        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(WeatherContract.LocationEntry.COLUMN_LOCATION_SETTING, testLocationSetting);
        values.put(WeatherContract.LocationEntry.COLUMN_CITY_NAME, testName);
        values.put(WeatherContract.LocationEntry.COLUMN_LATITUDE, testLatitude);
        values.put(WeatherContract.LocationEntry.COLUMN_LONGITUDE, testLongitude);

        long locationRowId;

        locationRowId = db.insert(WeatherContract.LocationEntry.TABLE_NAME, null, values);

        // verify we got row back.
        assertTrue(locationRowId != -1);
        Log.d(LOG_TAG, "New row id: " + locationRowId);

    }
    */

}
