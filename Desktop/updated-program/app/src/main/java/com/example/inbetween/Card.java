package com.example.inbetween;

import java.util.Random;

public class Card{
        private int cardValue;
        private int suitValue;

        private String cardName;
        private String suitName;

        private int backCard = R.drawable.baccard;

        private int burgerSuit[] = {R.drawable.b1, R.drawable.b2, R.drawable.b3, R.drawable.b4, R.drawable.b5, R.drawable.b6,
            R.drawable.b7, R.drawable.b8, R.drawable.b9, R.drawable.b10, R.drawable.b11, R.drawable.b12, R.drawable.b13};

        private int friesSuit[] = {R.drawable.f1, R.drawable.f2, R.drawable.f3, R.drawable.f4, R.drawable.f5, R.drawable.f6,
            R.drawable.f7, R.drawable.f8, R.drawable.f9, R.drawable.f10, R.drawable.f11, R.drawable.f12, R.drawable.f13};

        private int ringsSuit[] = {R.drawable.r1, R.drawable.r2, R.drawable.r3, R.drawable.r4, R.drawable.r5, R.drawable.r6,
            R.drawable.r7, R.drawable.r8, R.drawable.r9, R.drawable.r10, R.drawable.r11, R.drawable.r12, R.drawable.r13};

        private int sodaSuit[] = {R.drawable.s1, R.drawable.s2, R.drawable.s3, R.drawable.s4, R.drawable.s5, R.drawable.s6,
            R.drawable.s7, R.drawable.s8, R.drawable.s9, R.drawable.s10, R.drawable.s11, R.drawable.s12, R.drawable.s13};


        public Card() {
            this.cardValue = new Random().nextInt(13);
            this.suitValue = new Random().nextInt(4) + 1;

        }

        public int getCardValue() {
            return this.cardValue;
        }

        public int getBackCard() {return backCard;}

        public int getCard() {
            int temp = 0;

            switch (this.suitValue) {
                case 1:
                    temp = burgerSuit[this.cardValue];
                    break;
                case 2:
                    temp = friesSuit[this.cardValue];
                    break;
                case 3:
                    temp = ringsSuit[this.cardValue];
                    break;
                case 4:
                    temp = sodaSuit[this.cardValue];
                    break;
            }
            
            return temp;
        }


}
