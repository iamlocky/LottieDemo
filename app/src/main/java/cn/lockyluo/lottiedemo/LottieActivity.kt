package cn.lockyluo.lottiedemo

import android.animation.Animator
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieDrawable
import kotlinx.android.synthetic.main.activity_lottie.*

class LottieActivity : AppCompatActivity() {
    var bo = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lottie)
        lottieView.setAnimation("data1.json")
        lottieView.repeatCount = LottieDrawable.INFINITE
        lottieView.playAnimation()

        lottieView.addAnimatorListener(object :Animator.AnimatorListener{
            override fun onAnimationRepeat(p0: Animator?) {
            }

            override fun onAnimationEnd(p0: Animator?) {
            }

            override fun onAnimationCancel(p0: Animator?) {
            }

            override fun onAnimationStart(p0: Animator?) {
            }

        })
        lottieView.setOnClickListener {
            bo = if (!bo) {
                lottieView.pauseAnimation()
                true
            } else {
                lottieView.resumeAnimation()
                false
            }
        }
    }
}
