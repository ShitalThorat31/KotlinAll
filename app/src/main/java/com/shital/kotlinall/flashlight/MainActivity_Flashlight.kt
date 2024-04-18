package com.shital.kotlinall.flashlight

import android.content.Context
import android.hardware.camera2.CameraManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.karumi.dexter.Dexter
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionDeniedResponse
import com.karumi.dexter.listener.PermissionGrantedResponse
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.single.PermissionListener
import com.shital.kotlinall.R

import com.shital.kotlinall.databinding.ActivityMainFlashlightBinding

class MainActivity_Flashlight : AppCompatActivity() {
    lateinit var binding : ActivityMainFlashlightBinding

    private var torchState : Boolean = false
    private lateinit var cameraManager: CameraManager
    private var camId : String = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainFlashlightBinding.inflate(layoutInflater)
        setContentView(binding.root)


        cameraManager = getSystemService(Context.CAMERA_SERVICE) as CameraManager
        camId = cameraManager.cameraIdList[0]

        Dexter.withContext(this).withPermission(android.Manifest.permission.CAMERA).withListener(object : PermissionListener{
            override fun onPermissionGranted(p0: PermissionGrantedResponse?) {
                turnOnFlashLight()
            }

            override fun onPermissionDenied(p0: PermissionDeniedResponse?) {
                Toast.makeText(this@MainActivity_Flashlight, " please gr@ant the permission", Toast.LENGTH_SHORT).show()
            }

            override fun onPermissionRationaleShouldBeShown(
                p0: PermissionRequest?,
                p1: PermissionToken?
            ) {
                p1?.continuePermissionRequest()
            }

        }).check()

    }

    private fun turnOnFlashLight() {
        binding.imgTorch.setOnClickListener {
            torchState = when(torchState){
                false->{
                    cameraManager.setTorchMode(camId,true)
                    binding.imgTorch.setImageResource(R.drawable.flashlight_on)
                    true
                }
                true->{
                    cameraManager.setTorchMode(camId,false)
                    binding.imgTorch.setImageResource(R.drawable.flashlight_off)
                    false
                }
            }
        }
    }
}