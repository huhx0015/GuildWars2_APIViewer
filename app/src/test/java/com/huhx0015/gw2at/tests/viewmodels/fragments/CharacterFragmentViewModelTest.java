package com.huhx0015.gw2at.tests.viewmodels.fragments;

import com.huhx0015.gw2at.viewmodels.fragments.CharacterFragmentViewModel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by Michael Yoon Huh on 6/6/2017.
 */

@RunWith(MockitoJUnitRunner.class)
public class CharacterFragmentViewModelTest {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // MOCK VARIABLES
    @Mock
    private CharacterFragmentViewModel mViewModel;

    // TEST VARIABLES
    private static final String TEST_CHARACTER_NAME = "huhx0015";
    private static final String TEST_CHARACTER_RACE = "Human";
    private static final String TEST_CHARACTER_LEVEL = "99";

    /** INIT METHODS ___________________________________________________________________________ **/

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mViewModel = new CharacterFragmentViewModel();
    }

    /** TEST METHODS ___________________________________________________________________________ **/

    @Test
    public void testSetCharacterVisibility() throws Exception {
        Assert.assertEquals(false, mViewModel.characterVisibility);
        mViewModel.setCharacterVisibility(true);
        Assert.assertEquals(true, mViewModel.characterVisibility);
    }

    @Test
    public void testSetCharacterName() throws Exception {
        mViewModel.setCharacterName(TEST_CHARACTER_NAME);
        Assert.assertEquals(TEST_CHARACTER_NAME, mViewModel.characterName);
    }

    @Test
    public void testSetCharacterRace() throws Exception {
        mViewModel.setCharacterRace(TEST_CHARACTER_RACE);
        Assert.assertEquals(TEST_CHARACTER_RACE, mViewModel.characterRace);
    }

    @Test
    public void testSetCharacterLevel() throws Exception {
        mViewModel.setCharacterLevel(TEST_CHARACTER_LEVEL);
        Assert.assertEquals(TEST_CHARACTER_LEVEL, mViewModel.characterLevel);
    }
}
