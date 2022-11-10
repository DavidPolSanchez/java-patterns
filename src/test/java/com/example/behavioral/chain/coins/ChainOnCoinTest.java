package com.example.behavioral.chain.coins;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ChainOnCoinTest {
    private CoinInserter sut;
    @BeforeEach
    public void initSut(){
        this.sut = new CoinInserter1Dollar();
        sut.setNextInserter(new CoinInserter50Cent()).setNextInserter(new CoinInserter25Cent());

    }


    @Test
    void whenCoin1DolarIsAccepted() {
        Coin coin1d = new Coin(100, 100); // 1 dollar
        boolean accepted = sut.insert(coin1d);
        Assertions.assertTrue(accepted);

    }

    @Test
    void whenCoin50CentIsAccepted() {
        Coin coin1d = new Coin(50, 50); // 1 dollar
        boolean accepted = sut.insert(coin1d);
        Assertions.assertTrue(accepted);

    }
    @Test
    void whenCoin25CentIsAccepted() {
        Coin coin1d = new Coin(25, 25); // 1 dollar
        boolean accepted = sut.insert(coin1d);
        Assertions.assertTrue(accepted);

    }

}