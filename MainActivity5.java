package com.example.myapplication;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity5 extends AppCompatActivity {

    Button btnDraw, btnReveal, btnHigher, btnLower, btnBet, btnReset, btnFold;

    int potMoney, bet;
    int lowCard = 1;
    int highCard = 14;
    int firstCard, secondCard, thirdCard, higher = 0, lower = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        btnDraw = findViewById(R.id.btnDraw);
        btnBet = findViewById(R.id.btnBet);
        btnReveal = findViewById(R.id.btnReveal);
        btnHigher = findViewById(R.id.btnHigher);
        btnLower = findViewById(R.id.btnLower);
        btnReset = findViewById(R.id.btnReset);
        btnFold = findViewById(R.id.btnFold);

        btnDraw.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Random firstRndCard = new Random();
                firstCard = firstRndCard.nextInt(highCard - lowCard) + lowCard;

                Random secondRndCard = new Random();
                secondCard = secondRndCard.nextInt(highCard - lowCard) + lowCard;
            }
        });



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
}