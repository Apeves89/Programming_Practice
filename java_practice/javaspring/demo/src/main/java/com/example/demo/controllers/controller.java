package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class controller {

    public static int[] myData = {1,2,3,4,5,6};

    @GetMapping("/")
    public String HelloWorld() {
        return "Hello World";
    }
    
    @GetMapping("/data")
    public int[] getData(){
        return myData;
    }

    @GetMapping("/data/{index}")
    public int getSingleData (@PathVariable (value="index") int index){
        return myData[index];
    }

    @PostMapping("/data/{newData}")
    public int[] addData (@PathVariable(value="newData") String newData){
        int x = Integer.parseInt(newData);
        myData = addX(myData.length,myData,x);
        return myData;
    }

    public int[] addX(int n, int arr[], int x){
        int i;
        
        // create a new array of size n+1
       int newarr[] = new int[n + 1];
   
       // insert the elements from
       // the old array into the new array
       // insert all elements till n
       // then insert x at n+1
       for (i = 0; i < n; i++)
           newarr[i] = arr[i];
   
       newarr[n] = x;
   
       return newarr;
    }
    
}
