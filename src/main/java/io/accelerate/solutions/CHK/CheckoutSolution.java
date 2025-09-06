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
        prices.put('E', 40)

        Map<java.lang.Character, java.lang.String[]> specialOffers = new java.util.HashMap<>();
        specialOffers.put('A', new java.lang.String[]{"3A for 130", "5A for 200"});
        specialOffers.put('B', new java.lang.String[]{"2B for 45"});
        specialOffers.put('C', new java.lang.String[]{"No offer"});
        specialOffers.put('D', new java.lang.String[]{"No offer"});
        specialOffers.put('E', new java.lang.String[]{"2E get one B free"});

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
            /*if(specialOffers.get(item).equals("3A for 130")){
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
            }*/
        }

        return totalCost;
    }

}
