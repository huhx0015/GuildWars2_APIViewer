package com.huhx0015.mgw2s.interfaces;

import com.android.annotations.Nullable;
import com.huhx0015.mgw2s.models.responses.BuildResponse;
import com.huhx0015.mgw2s.models.responses.backstory.BackstoryQuestionResponse;
import com.huhx0015.mgw2s.models.responses.achievements.AchievementsCategoriesResponse;
import com.huhx0015.mgw2s.models.responses.achievements.AchievementsDailyResponse;
import com.huhx0015.mgw2s.models.responses.achievements.AchievementsGroupResponse;
import com.huhx0015.mgw2s.models.responses.achievements.AchievementsResponse;
import com.huhx0015.mgw2s.models.responses.account.AccountInventoryResponse;
import com.huhx0015.mgw2s.models.responses.account.AccountMasteriesResponse;
import com.huhx0015.mgw2s.models.responses.account.AccountMaterialsResponse;
import com.huhx0015.mgw2s.models.responses.WalletResponse;
import com.huhx0015.mgw2s.models.responses.account.AccountFinishersResponse;
import com.huhx0015.mgw2s.models.responses.account.AccountResponse;
import com.huhx0015.mgw2s.models.responses.account.AccountAchievementsResponse;
import com.huhx0015.mgw2s.models.responses.account.AccountBankResponse;
import com.huhx0015.mgw2s.models.responses.backstory.BackstoryAnswerResponse;
import java.util.List;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Michael Yoon Huh on 1/30/2017.
 *
 * API V2 List: https://wiki.guildwars2.com/wiki/API:2
 *
 *

 The base URL for all endpoints is https://api.guildwars2.com.

 /v2/account
 /v2/account/achievements
 /v2/account/bank
 /v2/account/dyes
 /v2/account/finishers
 /v2/account/inventory
 /v2/account/masteries
 /v2/account/materials
 /v2/account/minis
 /v2/account/outfits
 /v2/account/recipes
 /v2/account/skins
 /v2/account/titles
 /v2/account/wallet
 /v2/achievements
 /v2/achievements/categories
 /v2/achievements/daily
 /v2/achievements/daily/tomorrow
 /v2/achievements/groups
 /v2/backstory/answers
 /v2/backstory/questions
 /v2/build
 /v2/characters
 /v2/colors
 /v2/commerce/exchange
 /v2/commerce/exchange/coins
 /v2/commerce/exchange/gems
 /v2/commerce/listings
 /v2/commerce/prices
 /v2/commerce/transactions
 /v2/continents
 /v2/currencies
 /v2/emblem
 /v2/files
 /v2/finishers
 /v2/guild/:id
 /v2/guild/:id/log
 /v2/guild/:id/members
 /v2/guild/:id/ranks
 /v2/guild/:id/stash
 /v2/guild/:id/teams
 /v2/guild/:id/treasury
 /v2/guild/:id/upgrades
 /v2/guild/permissions
 /v2/guild/search
 /v2/guild/upgrades
 /v2/items
 /v2/itemstats
 /v2/legends
 /v2/maps
 /v2/masteries
 /v2/materials
 /v2/minis
 /v2/outfits
 /v2/pets
 /v2/professions
 /v2/pvp
 /v2/pvp/amulets
 /v2/pvp/games
 /v2/pvp/ranks
 /v2/pvp/seasons
 /v2/pvp/seasons/leaderboards
 /v2/pvp/standings
 /v2/pvp/stats
 /v2/quaggans
 /v2/recipes
 /v2/recipes/search
 /v2/skills
 /v2/skins
 /v2/specializations
 /v2/stories
 /v2/stories/seasons
 /v2/titles
 /v2/tokeninfo
 /v2/traits
 /v2/worlds
 /v2/wvw
 /v2/wvw/abilities
 /v2/wvw/matches
 /v2/wvw/objectives
 /v2/wvw/ranks
 */

public interface RetrofitInterface {

    // ACCOUNT:
    @GET("account")
    Observable<AccountResponse> getAccount(@Header("Authorization") String bearer);
    Observable<AccountResponse> getAccountToken(@Query("access_token") String token);

    // ACCOUNT/ACHIEVEMENTS:
    @GET("account/achievements")
    Observable<AccountAchievementsResponse> getAccountAchievements(@Header("Authorization") String bearer);
    Observable<AccountAchievementsResponse> getAccountAchievementsToken(@Query("access_token") String token);

    // ACCOUNT/BANK:
    @GET("account/achievements")
    Observable<AccountBankResponse> getAccountBank(@Header("Authorization") String bearer);
    Observable<AccountBankResponse> getAccountBankToken(@Query("access_token") String token);

    // ACCOUNT/DYES:
    @GET("account/dyes")
    Observable<List<Integer>> getAccountDyes(@Header("Authorization") String bearer);
    Observable<List<Integer>> getAccountDyesToken(@Query("access_token") String token);

    // ACCOUNT/FINISHERS:
    @GET("account/finishers")
    Observable<AccountFinishersResponse> getAccountFinishers(@Header("Authorization") String bearer);
    Observable<AccountFinishersResponse> getAccountFinishersToken(@Query("access_token") String token);

    // ACCOUNT/INVENTORY:
    @GET("account/inventory")
    Observable<AccountInventoryResponse> getAccountInventory(@Header("Authorization") String bearer);
    Observable<AccountInventoryResponse> getAccountInventoryToken(@Query("access_token") String token);

    // ACCOUNT/INVENTORY:
    @GET("account/masteries")
    Observable<AccountMasteriesResponse> getAccountMasteries(@Header("Authorization") String bearer);
    Observable<AccountMasteriesResponse> getAccountMasteriesToken(@Query("access_token") String token);

    // ACCOUNT/MATERIALS:
    @GET("account/materials")
    Observable<AccountMaterialsResponse> getAccountMaterials(@Header("Authorization") String bearer);
    Observable<AccountMaterialsResponse> getAccountMaterialsToken(@Query("access_token") String token);

    // ACCOUNT/MINIS:
    @GET("account/minis")
    Observable<List<Integer>> getAccountMinis(@Header("Authorization") String bearer);
    Observable<List<Integer>> getAccountMinisToken(@Query("access_token") String token);

    // ACCOUNT/OUTFITS:
    @GET("account/outfits")
    Observable<List<Integer>> getAccountOutfits(@Header("Authorization") String bearer);
    Observable<List<Integer>> getAccountOutfitsToken(@Query("access_token") String token);

    // ACCOUNT/RECIPES:
    @GET("account/recipes")
    Observable<List<Integer>> getAccountRecipes(@Header("Authorization") String bearer);
    Observable<List<Integer>> getAccountRecipesToken(@Query("access_token") String token);

    // ACCOUNT/SKINS:
    @GET("account/skins")
    Observable<List<Integer>> getAccountSkins(@Header("Authorization") String bearer);
    Observable<List<Integer>> getAccountSkinsToken(@Query("access_token") String token);

    // ACCOUNT/TITLES:
    @GET("account/titles")
    Observable<List<Integer>> getAccountTitles(@Header("Authorization") String bearer);
    Observable<List<Integer>> getAccountTitlesToken(@Query("access_token") String token);

    // ACCOUNT/WALLET:
    @GET("account/wallet")
    Observable<WalletResponse> getAccountWallet(@Header("Authorization") String bearer);
    Observable<WalletResponse> getAccountWalletToken(@Query("access_token") String token);

    // ACHIEVEMENTS:
    @GET("achievements")
    Observable<AchievementsResponse> getAchievements(@Nullable @Query("lang") String lang);

    // ACHIEVEMENTS/CATEGORIES:
    @GET("achievements/categories/{id}")
    Observable<AchievementsCategoriesResponse> getAchievementsCategories(@Path("id") String id,
                                                                         @Nullable @Query("lang") String lang);
    // ACHIEVEMENTS/DAILY:
    @GET("achievements/daily")
    Observable<AchievementsDailyResponse> getAchievementsDaily();

    // ACHIEVEMENTS/DAILY/TOMORROW:
    @GET("achievements/daily/tomorrow")
    Observable<AchievementsDailyResponse> getAchievementsDailyTomorrow();

    // ACHIEVEMENTS/GROUPS:
    @GET("achievements/groups/{id}")
    Observable<AchievementsGroupResponse> getAchievementsGroup(@Path("id") String id,
                                                               @Nullable @Query("lang") String lang);

    // BACKSTORY/ANSWERS:
    @GET("backstory/answers")
    Observable<List<String>> getBackstoryAnswers();
    @GET("backstory/answers/{id}")
    Observable<BackstoryAnswerResponse> getBackstoryAnswerId(@Path("id") String id,
                                                             @Nullable @Query("lang") String lang,
                                                             @Nullable @Query("page") Integer page,
                                                             @Nullable @Query("page_size") String page_size);
    @GET("backstory/answers/")
    Observable<List<BackstoryAnswerResponse>> getBackstoryAnswerIds(@Query("ids") String ids,
                                                                    @Nullable @Query("lang") String lang,
                                                                    @Nullable @Query("page") Integer page,
                                                                    @Nullable @Query("page_size") String page_size);

    // BACKSTORY/QUESTIONS:
    @GET("/v2/backstory/questions")
    Observable<List<Integer>> getBackstoryQuestions(@Nullable @Query("lang") String lang);
    @GET("backstory/questions/{id}")
    Observable<BackstoryQuestionResponse> getBackstoryQuestionId(@Path("id") String id,
                                                                 @Nullable @Query("lang") String lang,
                                                                 @Nullable @Query("page") Integer page,
                                                                 @Nullable @Query("page_size") String page_size);
    @GET("backstory/questions/")
    Observable<List<BackstoryQuestionResponse>> getBackstoryQuestionIds(@Query("ids") String ids,
                                                                        @Nullable @Query("lang") String lang,
                                                                        @Nullable @Query("page") Integer page,
                                                                        @Nullable @Query("page_size") String page_size);

    // BUILD:
    @GET("/v2/build")
    Observable<BuildResponse> getBuild();

    // CHARACTERS:
    @GET("/v2/characters")
    Observable<AchievementsResponse> getCharacters(@Header("Authorization") String bearer);
}
