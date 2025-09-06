package io.accelerate.solutions.CHK;

import io.accelerate.runner.SolutionNotImplementedException;
import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {



    public Integer checkout(String skus) {
        skus = skus.trim();
        java.util.Map<java.lang.Character, java.lang.Integer> prices = new java.util.HashMap<>();
        prices.put('A', 50);
        prices.put('B', 30);
        prices.put('C', 20);
        prices.put('D', 15);

        Map<java.lang.Character, java.lang.String> specialOffers = new java.util.HashMap<>();
        specialOffers.put('A', "3A for 130");
        specialOffers.put('B', "2B for 45");

        Map<java.lang.Character, java.lang.Integer> count = new java.util.HashMap<>();

        for(int i = 0; i < skus.toCharArray().length; i++){
            if(!prices.containsKey(skus.toCharArray()[i])){
                return -1;
            }
            if(count.containsKey(skus.toCharArray()[i])){
                count.put(skus.toCharArray()[i], count.get(skus.toCharArray()[i])+1);
            }else{
                count.put(skus.toCharArray()[i], 1);
            }
        }

        java.lang.Integer totalCost = 0;

        for(Map.Entry<java.lang.Character, java.lang.Integer> entry : count.entrySet()){
            java.lang.Character item = entry.getKey();
            java.lang.Integer countValue = entry.getValue();

            if(specialOffers.get(item).equals("3A for 130")){
                java.lang.Integer offerPrice = 130;
                java.lang.Integer offerQuantity = 3;
                totalCost += (countValue/offerQuantity) * offerPrice;
                totalCost += (countValue%offerQuantity) * prices.get(item);
            }else{
                if(specialOffers.get(item).equals("2B for 45")){
                    java.lang.Integer offerPrice = 45;
                    java.lang.Integer offerQuantity = 2;
                    totalCost += (countValue/offerQuantity) * offerPrice;
                    totalCost += (countValue%offerQuantity) * prices.get(item);
                }else{
                    totalCost += countValue * prices.get(item);
                }
            }
        }

        return totalCost;
    }

}






