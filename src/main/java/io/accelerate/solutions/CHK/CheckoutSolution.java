package io.accelerate.solutions.CHK;

import io.accelerate.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        Map<char, int> prices = new HashMap<>();
        prices.put('A', 50);
        prices.put('B', 30);
        prices.put('C', 20);
        prices.put('D', 15);

        Map<char, String> specialOffers = new HashMap<>();
        specialOffers.put('A', "3A for 130");
        specialOffers.put('B', "2B for 45");

        charList = skus.toCharArray();


    }
}

