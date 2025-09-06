package io.accelerate.solutions.CHK;

import io.accelerate.runner.SolutionNotImplementedException;

public class CheckoutSolution {



    public Integer checkout(String skus) {

        Map<char, int> prices = new HashMap<>();
        prices.put("A", 50);
        prices.put('B', 30);
        prices.put('C', 20);
        prices.put('D', 15);

        Map<char, String> specialOffers = new HashMap<>();
        specialOffers.put('A', "3A for 130");
        specialOffers.put('B', "2B for 45");


        charList = skus.toCharArray();

        Map<char, Integer> count = new HashMap<>();

        for(int i = 0; i < charList.length(); i++){
            if(!prices.containsKey(charList[i])){
                return -1;
            }
            if(count.containsKey(charList[i])){
                count.put(charList[i], count.get(charList[i])+1);
            }else{
                count.put(charList[i], 1);
            }
        }

        return calculatePrice(count);
    }


    public Integer calculatePrice(Map<char, int> count){
        int totalCost = 0;

        for(Map.Entry<char, int> entry : count.entrySet()){
            char item = entry.getKey();
            int countValue = entry.getValue();
        }
        if(specialOffers.get(item).equals("3A for 130")){
            int offerPrice = 130;
            int offerQuantity = 3;
            totalCost += (countValue/offerQuantity) * offerPrice;
            totalCost += (countValue%offerQuantity) * prices.get(item);
        }else{
            if(specialOffers.get(item).equals("2B for 45")){
                int offerPrice = 45;
                int offerQuantity = 2;
                totalCost += (countValue/offerQuantity) * offerPrice;
                totalCost += (countValue%offerQuantity) * prices.get(item);
            }else{
                totalCost += count * prices.get(item);
            }
        }
        return totalCost;
    }
}
