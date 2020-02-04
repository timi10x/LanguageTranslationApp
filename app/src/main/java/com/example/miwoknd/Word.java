package com.example.miwoknd;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImage = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED= -1;

    private int mAudioResources;

    public Word(String defaultTranslation, String miwokTranslation, int image, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImage = image;
        mAudioResources = audioResourceId;

    }

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResources = audioResourceId;
    }

    /**
     * gets the default translation of the word
     * @return
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * get the Miwok translation of the word
     * @return
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    /**
     * get the respective image for the list
     * @return
     */
    public int getmImage(){return mImage;}

    /**
     * get the respective image for the list
     * @return
     */
    public int getmAudioResources() {
        return mAudioResources;
    }

    /**
     * returns true of false if there is an image or not
     * @return
     */
    public boolean hasImage(){
        return mImage != NO_IMAGE_PROVIDED;
    }
}
