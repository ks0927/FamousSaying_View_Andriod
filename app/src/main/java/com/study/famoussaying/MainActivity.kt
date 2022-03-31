package com.study.famoussaying

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.study.famoussaying.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var backdouble = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sentencelist = mutableListOf<String>()
        sentencelist.add("삶이 있는 한 희망은 있다  -키케로")
        sentencelist.add("산다는것 그것은 치열한 전투이다.  -로망로랑")
        sentencelist.add("피할수 없으면 즐겨라 – 로버트 엘리엇")
        sentencelist.add("어리석은 자는 멀리서 행복을 찾고, 현명한 자는 자신의 발치에서 행복을 키워간다  -제임스 오펜하임")
        sentencelist.add("돈이란 바닷물과도 같다. 그것은 마시면 마실수록 목이 말라진다. -쇼펜하우어")
        sentencelist.add("최고에 도달하려면 최저에서 시작하라. -P.시루스")
        sentencelist.add("평생 살 것처럼 꿈을 꾸어라.그리고 내일 죽을 것처럼 오늘을 살아라. – 제임스 딘")
        sentencelist.add("작은 기회로 부터 종종 위대한 업적이 시작된다  -데모스테네스")
        sentencelist.add("한 번 실패와 영원한 실패를 혼동하지 마라. -F.스콧 핏제랄드")
        sentencelist.add("문제는 목적지에 얼마나 빨리 가느내가 아니라 그 목적지가 어디냐는 것이다. -메이벨 뉴컴버")

        val randomsentnece =sentencelist.random()
        Log.d("MainActivity",randomsentnece)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.BtnShowallsentence.setOnClickListener{
            val intent  = Intent(this,SentenceActivity::class.java)
            startActivity(intent)
        }
        binding.TVRandomsentence.setText(randomsentnece)


        }
@Suppress("DEPRECATION")
    override fun onBackPressed() {
        if (backdouble == true) {
            finish()
        }
        backdouble = true
        Toast.makeText(this, "한 번 더 누르시면 종료됩니다.", Toast.LENGTH_SHORT).show()

        Handler().postDelayed(Runnable{         /*여기서 왜 Runnable을 써도 안써도 되는걸까...*/
            backdouble = false
        }, 2000)
    }


}