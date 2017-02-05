package com.huhx0015.gw2at.viewmodels.fragments;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import com.huhx0015.gw2at.BR;

/**
 * Created by Michael Yoon Huh on 2/4/2017.
 */

public class CharacterFragmentViewModel extends BaseObservable {

    @Bindable
    public boolean characterVisibility = false;

    @Bindable
    public String characterName;

    @Bindable
    public String characterRace;

    @Bindable
    public String characterGender;

    @Bindable
    public String characterProfession;

    @Bindable
    public String characterLevel;

    @Bindable
    public String characterGuild;

    @Bindable
    public String characterAge;

    @Bindable
    public String characterCreated;

    @Bindable
    public String characterDeaths;

    public void setCharacterVisibility(boolean isVisible) {
        this.characterVisibility = isVisible;
        notifyPropertyChanged(BR.characterVisibility);
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
        notifyPropertyChanged(BR.characterName);
    }

    public void setCharacterRace(String characterRace) {
        this.characterRace = characterRace;
        notifyPropertyChanged(BR.characterRace);
    }

    public void setCharacterGender(String characterGender) {
        this.characterGender = characterGender;
        notifyPropertyChanged(BR.characterGender);
    }

    public void setCharacterProfession(String characterProfession) {
        this.characterProfession = characterProfession;
        notifyPropertyChanged(BR.characterProfession);
    }

    public void setCharacterLevel(String characterLevel) {
        this.characterLevel = characterLevel;
        notifyPropertyChanged(BR.characterLevel);
    }

    public void setCharacterGuild(String characterGuild) {
        this.characterGuild = characterGuild;
        notifyPropertyChanged(BR.characterGuild);
    }

    public void setCharacterAge(String characterAge) {
        this.characterAge = characterAge;
        notifyPropertyChanged(BR.characterAge);
    }

    public void setCharacterCreated(String characterCreated) {
        this.characterCreated = characterCreated;
        notifyPropertyChanged(BR.characterCreated);
    }

    public void setCharacterDeaths(String characterDeaths) {
        this.characterDeaths = characterDeaths;
        notifyPropertyChanged(BR.characterDeaths);
    }
}
