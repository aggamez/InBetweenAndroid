package com.example.myapplication;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity5 extends AppCompatActivity {

    Button btnDraw;
    //btnReveal, btnHigher, btnLower, btnBet, btnReset, btnFold;
    ImageView card1, card2, card3;

    int burgerSuit[] = {R.drawable.b1, R.drawable.b2, R.drawable.b3, R.drawable.b4, R.drawable.b5, R.drawable.b6,
            R.drawable.b7, R.drawable.b8, R.drawable.b9, R.drawable.b10, R.drawable.b11, R.drawable.b12, R.drawable.b13};

    int friesSuit[] = {R.drawable.f1, R.drawable.f2, R.drawable.f3, R.drawable.f4, R.drawable.f5, R.drawable.f6,
            R.drawable.f7, R.drawable.f8, R.drawable.f9, R.drawable.f10, R.drawable.f11, R.drawable.f12, R.drawable.f13};

    int ringsSuit[] = {R.drawable.r1, R.drawable.r2, R.drawable.r3, R.drawable.r4, R.drawable.r5, R.drawable.r6,
            R.drawable.r7, R.drawable.r8, R.drawable.r9, R.drawable.r10, R.drawable.r11, R.drawable.r12, R.drawable.r13};

    int sodaSuit[] = {R.drawable.s1, R.drawable.s2, R.drawable.s3, R.drawable.s4, R.drawable.s5, R.drawable.s6,
            R.drawable.s7, R.drawable.s8, R.drawable.s9, R.drawable.s10, R.drawable.s11, R.drawable.s12, R.drawable.s13};

    //int potMoney, bet;
    int lowCard = 1;
    int highCard = 14;
    int firstCard, secondCard; //thirdCard, higher = 0, lower = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        card1 = findViewById(R.id.card1);
        card2 = findViewById(R.id.card2);
        card3 = findViewById(R.id.card3);
        btnDraw = findViewById(R.id.btnDraw);
        /*btnBet = findViewById(R.id.btnBet);
        btnReveal = findViewById(R.id.btnReveal);
        btnHigher = findViewById(R.id.btnHigher);
        btnLower = findViewById(R.id.btnLower);
        btnReset = findViewById(R.id.btnReset);
        btnFold = findViewById(R.id.btnFold);

         */

        card1.setImageResource(R.drawable.baccard);
        card2.setImageResource(R.drawable.baccard);
        card3.setImageResource(R.drawable.baccard);

        btnDraw.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                Random suits1 = new Random();
                char firstCardSuit = (char) ('a'+suits1.nextInt(5));

                if (firstCardSuit == 'a')
                {
                    Random firstRndCard = new Random();
                    firstCard = 'b' + firstRndCard.nextInt((highCard - lowCard) + lowCard);
                    card1.setImageResource(firstCard);
                }

                else if (firstCardSuit == 'b')
                {
                    Random firstRndCard = new Random();
                    firstCard = 'f' +  firstRndCard.nextInt((highCard - lowCard) + lowCard);
                    card1.setImageResource(firstCard);
                }

                else if (firstCardSuit == 'c')
                {
                    Random firstRndCard = new Random();
                    firstCard = 'r' + firstRndCard.nextInt((highCard - lowCard) + lowCard);
                    card1.setImageResource(firstCard);
                }

                else if (firstCardSuit == 'd')

                {
                    Random firstRndCard = new Random();
                    firstCard = 's' + firstRndCard.nextInt((highCard - lowCard) + lowCard);
                    card1.setImageResource(firstCard);
                }

/*
                Random suits2 = new Random();
                char secondCardSuit = (char) ('a'+suits2.nextInt(4));

                if (secondCardSuit == 'a') {
                    Random secondRndCard = new Random();
                    secondCard = secondRndCard.nextInt((highCard - lowCard) + lowCard);
                    card2.setImageResource('b' + secondCard);
                } else if (secondCardSuit == 'b') {
                    Random secondRndCard = new Random();
                    secondCard = secondRndCard.nextInt((highCard - lowCard) + lowCard);
                    card2.setImageResource('f' + secondCard);
                } else if (secondCardSuit == 'c') {
                    Random secondRndCard = new Random();
                    secondCard = secondRndCard.nextInt((highCard - lowCard) + lowCard);
                    card2.setImageResource('r' + secondCard);
                } else if (secondCardSuit == 'd') {
                    Random secondRndCard = new Random();
                    secondCard = secondRndCard.nextInt((highCard - lowCard) + lowCard);
                    card2.setImageResource('s' + secondCard);
                }

 */
            }

        });

        /*
        btnHigher.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                higher = 1;
                lower = 0;
            }
        });

        btnLower.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                higher = 0;
                lower = 1;
            }
        });

        btnBet.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (firstCard == secondCard)
                {
                //higher or lower
                }
            }
        });

        btnReveal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Random thirdRndCard = new Random();
                thirdCard = thirdRndCard.nextInt(highCard - lowCard) + lowCard;
            }
        });

        btnFold.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Random thirdRndCard = new Random();
                thirdCard = thirdRndCard.nextInt(highCard - lowCard) + lowCard;
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                potMoney = 0;
                //reset cards
            }
        });

        if (firstCard == (secondCard - 1) || firstCard == (secondCard + 1))
        {
            //consecutive cards
        }

        if (isValid())
        {
            if (firstCard != secondCard)
            {
                if (thirdCard > firstCard && thirdCard < secondCard || thirdCard < firstCard && thirdCard > secondCard)
                {
                    potMoney = potMoney + bet;
                    //win
                }

                else
                {
                    potMoney = potMoney - bet;
                    //lose
                }
            }

            else
            {
                if (thirdCard > firstCard && higher == 1)
                {
                    potMoney = potMoney + bet;
                    //win
                }

                else if (thirdCard < firstCard && higher == 1)
                {
                    potMoney = potMoney - bet;
                    //lose
                }

                if (thirdCard < firstCard && lower == 1)
                {
                    potMoney = potMoney + bet;
                    //win
                }

                else if (thirdCard > firstCard && lower == 1)
                {
                    potMoney = potMoney - bet;
                    //lose
                }
            }

        }

        if (potMoney <= 0)
        {
            //no money left
        }
    }

    public boolean isValid()
    {
        try
        {
            if (bet > potMoney)
            {
                bet = 0;
            }

            else
            {

            }
        }

        catch (Exception b)
        {

        }
    }

         */
    }
}