package com.example.module4hw3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    List<Fish> fishes = new ArrayList<Fish>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.list_animal);

        FishAdapter adapter = new FishAdapter(this, fishes);

        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){
        fishes.add(new Fish("Кузовок-кубик","Морской аналог прямоугольных арбузов, которые продаются в Японии, рыба кузовок-кубик",
                R.drawable.fish1,"Численность средняя"));
        fishes.add(new Fish("Краснопёрый опах","С точки зрения своего внешнего вида, красноперый опах мало кого удивит. Возможно вам приходилось видеть этих рыб в больших аквариумах. То что делает красноперого опаха поистине необычной рыбой находится не снаружи, а внутри: это первый выявленный вид теплокровных рыб, то есть они самостоятельно способны поддерживать свою внутреннею температуру тела на 10° С выше температуры окружающей воды.",
                R.drawable.fish2,"Численность большая (есть даже огненные)"));
        fishes.add(new Fish("Красный паку","Эта южноамериканская рыба обладает необычными человеческими зубами.",
                R.drawable.fish3,"Численность большая"));
        fishes.add(new Fish("Обычная ванделлия","Одна из немногих идентифицированных паразитических рыб, обычная ванделлия, проводит практически всю свою жизнь, обитая в жабрах крупных сомов реки Амазонка.",
                R.drawable.fish4,"Численность большая"));
        fishes.add(new Fish("Психоделическая рыба-лягушка","Имеют большое плоское лицо, голубые глаза, гигантскую пасть и, что наиболее важно, полосатый бело-оранжево-коричневый узор.",
                R.drawable.fish5,"Численность большая"));
    }
}