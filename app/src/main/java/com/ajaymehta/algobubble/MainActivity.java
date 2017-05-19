package com.ajaymehta.algobubble;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView beforeSort, afterSort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        beforeSort = (TextView) findViewById(R.id.tv_array_before);
        afterSort = (TextView) findViewById(R.id.tv_array_after);


        beforeSorting();

        afterSorting(ArrayClass.numberArray);


    }
    // before looking at this code...first see on youtube how bubble sort work..i mean animation..bang baby..
    // see how this work the whole process...
    // our array will loop through 10 times.. i =0 to 9
    // n we are comparing the element at j-1 location n j location .. (means 0,1)  because we are two element that are next to each other..coz our internal loop will go 10 times for every i location (0 to 9)
    // n we going (i-1) in our j loop coz after every 10 elements our last element will be sorted ...so we going 1 less every time..n getting our last element sorted...thats also kind of optimzation lol...

    private void afterSorting(int arr[]) {  // it take first two elemnts and check if 1st elemnt is bigger then it swipes...n then it do the same process for (2,3) element then (3,4)

        int n = arr.length;  // length of array

        int temp = 0;

        String output = "";

        for (int i = 0; i < n; i++) {

            for (int j = 1 ; j < n - i; j++) {   // n-1 coz our biggest element in every j looping..will get to the end.

                if (arr[j - 1] > arr[j]) {  // then swipe

                    temp = arr[j];

                    arr[j] = arr[j - 1];

                    arr[j - 1] = temp;

                  //  output += arr[j] + ", ";
                }
            }
        }  // end of i loop...now our array is sorted...time to print it ..with the help of another loop..

// first append all the values  one by one coming from for loop inside loop brackets ...n print it outside loop

        for(int i = 0 ;i< arr.length ; i++) {
            output += arr[i] + ", ";

        }
            afterSort.setText("sorted "+ output);



    }

    private void beforeSorting() {

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < ArrayClass.numberArray.length; i++) {

            sb.append(ArrayClass.numberArray[i] + ", ");

        }

        // first append all the values coming from array n print it outside loop..
        beforeSort.setText("Unsorted " + sb);
    }
}
