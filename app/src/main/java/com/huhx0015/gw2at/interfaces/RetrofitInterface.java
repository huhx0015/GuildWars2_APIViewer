package com.huhx0015.gw2at.interfaces;

import com.android.annotations.Nullable;
import com.huhx0015.gw2at.models.responses.BuildResponse;
import com.huhx0015.gw2at.models.responses.EmblemResponse;
import com.huhx0015.gw2at.models.responses.QuaggansResponse;
import com.huhx0015.gw2at.models.responses.TokenInfoResponse;
import com.huhx0015.gw2at.models.responses.WorldsResponse;
import com.huhx0015.gw2at.models.responses.backstory.BackstoryQuestionResponse;
import com.huhx0015.gw2at.models.responses.achievements.AchievementsCategoriesResponse;
import com.huhx0015.gw2at.models.responses.achievements.AchievementsDailyResponse;
import com.huhx0015.gw2at.models.responses.achievements.AchievementsGroupResponse;
import com.huhx0015.gw2at.models.responses.achievements.AchievementsResponse;
import com.huhx0015.gw2at.models.responses.account.AccountInventoryResponse;
import com.huhx0015.gw2at.models.responses.account.AccountMasteriesResponse;
import com.huhx0015.gw2at.models.responses.account.AccountMaterialsResponse;
import com.huhx0015.gw2at.models.responses.WalletResponse;
import com.huhx0015.gw2at.models.responses.account.AccountFinishersResponse;
import com.huhx0015.gw2at.models.responses.account.AccountResponse;
import com.huhx0015.gw2at.models.responses.account.AccountAchievementsResponse;
import com.huhx0015.gw2at.models.responses.account.AccountBankResponse;
import com.huhx0015.gw2at.models.responses.backstory.BackstoryAnswerResponse;
import com.huhx0015.gw2at.models.responses.characters.CharacterBackstoryResponse;
import com.huhx0015.gw2at.models.responses.characters.CharacterCoreResponse;
import com.huhx0015.gw2at.models.responses.characters.CharacterCraftingResponse;
import com.huhx0015.gw2at.models.responses.characters.CharacterEquipmentResponse;
import com.huhx0015.gw2at.models.responses.characters.CharacterInventoryResponse;
import com.huhx0015.gw2at.models.responses.characters.CharacterOverviewResponse;
import com.huhx0015.gw2at.models.responses.characters.CharacterSkillsResponse;
import com.huhx0015.gw2at.models.responses.characters.CharacterSpecializationsResponse;
import com.huhx0015.gw2at.models.responses.characters.CharacterTrainingResponse;
import com.huhx0015.gw2at.models.responses.colors.ColorResponse;
import com.huhx0015.gw2at.models.responses.commerce.CommerceExchangeResponse;
import com.huhx0015.gw2at.models.responses.commerce.CommerceListingsResponse;
import com.huhx0015.gw2at.models.responses.commerce.CommercePricesResponse;
import com.huhx0015.gw2at.models.responses.commerce.CommerceTransactionsResponse;
import com.huhx0015.gw2at.models.responses.items.ItemResponse;
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
 * The base URL for all endpoints is https://api.guildwars2.com.
 *
 * /v2/account
 * /v2/account/achievements
 * /v2/account/bank
 * /v2/account/dyes
 * /v2/account/finishers
 * /v2/account/inventory
 * /v2/account/masteries
 * /v2/account/materials
 * /v2/account/minis
 * /v2/account/outfits
 * /v2/account/recipes
 * /v2/account/skins
 * /v2/account/titles
 * /v2/account/wallet
 * /v2/achievements
 * /v2/achievements/categories
 * /v2/achievements/daily
 * /v2/achievements/daily/tomorrow
 * /v2/achievements/groups
 * /v2/backstory/answers
 * /v2/backstory/questions
 * /v2/build
 * /v2/characters
 * /v2/colors
 * /v2/commerce/exchange
 * /v2/commerce/exchange/coins
 * /v2/commerce/exchange/gems
 * /v2/commerce/listings
 * /v2/commerce/prices
 * /v2/commerce/transactions
 * /v2/continents
 * /v2/currencies
 * /v2/emblem
 * /v2/files
 * /v2/finishers
 * /v2/guild/:id
 * /v2/guild/:id/log
 * /v2/guild/:id/members
 * /v2/guild/:id/ranks
 * /v2/guild/:id/stash
 * /v2/guild/:id/teams
 * /v2/guild/:id/treasury
 * /v2/guild/:id/upgrades
 * /v2/guild/permissions
 * /v2/guild/search
 * /v2/guild/upgrades
 * /v2/items
 * /v2/itemstats
 * /v2/legends
 * /v2/maps
 * /v2/masteries
 * /v2/materials
 * /v2/minis
 * /v2/outfits
 * /v2/pets
 * /v2/professions
 * /v2/pvp
 * /v2/pvp/amulets
 * /v2/pvp/games
 * /v2/pvp/ranks
 * /v2/pvp/seasons
 * /v2/pvp/seasons/leaderboards
 * /v2/pvp/standings
 * /v2/pvp/stats
 * /v2/quaggans
 * /v2/recipes
 * /v2/recipes/search
 * /v2/skills
 * /v2/skins
 * /v2/specializations
 * /v2/stories
 * /v2/stories/seasons
 * /v2/titles
 * /v2/tokeninfo
 * /v2/traits
 * /v2/worlds
 * /v2/wvw
 * /v2/wvw/abilities
 * /v2/wvw/matches
 * /v2/wvw/objectives
 * /v2/wvw/ranks
 */

public interface RetrofitInterface {

    // ACCOUNT:
    @GET("account")
    Observable<AccountResponse> getAccount(@Header("Authorization") String token);
    Observable<AccountResponse> getAccountToken(@Query("access_token") String token);

    // ACCOUNT/ACHIEVEMENTS:
    @GET("account/achievements")
    Observable<AccountAchievementsResponse> getAccountAchievements(@Header("Authorization") String token);
    Observable<AccountAchievementsResponse> getAccountAchievementsToken(@Query("access_token") String token);

    // ACCOUNT/BANK:
    @GET("account/achievements")
    Observable<AccountBankResponse> getAccountBank(@Header("Authorization") String token);
    Observable<AccountBankResponse> getAccountBankToken(@Query("access_token") String token);

    // ACCOUNT/DYES:
    @GET("account/dyes")
    Observable<List<Integer>> getAccountDyes(@Header("Authorization") String token);
    Observable<List<Integer>> getAccountDyesToken(@Query("access_token") String token);

    // ACCOUNT/FINISHERS:
    @GET("account/finishers")
    Observable<AccountFinishersResponse> getAccountFinishers(@Header("Authorization") String token);
    Observable<AccountFinishersResponse> getAccountFinishersToken(@Query("access_token") String token);

    // ACCOUNT/INVENTORY:
    @GET("account/inventory")
    Observable<AccountInventoryResponse> getAccountInventory(@Header("Authorization") String token);
    Observable<AccountInventoryResponse> getAccountInventoryToken(@Query("access_token") String token);

    // ACCOUNT/INVENTORY:
    @GET("account/masteries")
    Observable<AccountMasteriesResponse> getAccountMasteries(@Header("Authorization") String token);
    Observable<AccountMasteriesResponse> getAccountMasteriesToken(@Query("access_token") String token);

    // ACCOUNT/MATERIALS:
    @GET("account/materials")
    Observable<AccountMaterialsResponse> getAccountMaterials(@Header("Authorization") String token);
    Observable<AccountMaterialsResponse> getAccountMaterialsToken(@Query("access_token") String token);

    // ACCOUNT/MINIS:
    @GET("account/minis")
    Observable<List<Integer>> getAccountMinis(@Header("Authorization") String token);
    Observable<List<Integer>> getAccountMinisToken(@Query("access_token") String token);

    // ACCOUNT/OUTFITS:
    @GET("account/outfits")
    Observable<List<Integer>> getAccountOutfits(@Header("Authorization") String token);
    Observable<List<Integer>> getAccountOutfitsToken(@Query("access_token") String token);

    // ACCOUNT/RECIPES:
    @GET("account/recipes")
    Observable<List<Integer>> getAccountRecipes(@Header("Authorization") String token);
    Observable<List<Integer>> getAccountRecipesToken(@Query("access_token") String token);

    // ACCOUNT/SKINS:
    @GET("account/skins")
    Observable<List<Integer>> getAccountSkins(@Header("Authorization") String token);
    Observable<List<Integer>> getAccountSkinsToken(@Query("access_token") String token);

    // ACCOUNT/TITLES:
    @GET("account/titles")
    Observable<List<Integer>> getAccountTitles(@Header("Authorization") String token);
    Observable<List<Integer>> getAccountTitlesToken(@Query("access_token") String token);

    // ACCOUNT/WALLET:
    @GET("account/wallet")
    Observable<WalletResponse> getAccountWallet(@Header("Authorization") String token);
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
    @GET("backstory/questions")
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
    @GET("build")
    Observable<BuildResponse> getBuild();

    // CHARACTERS:
    @GET("characters")
    Observable<List<String>> getCharacters(@Header("Authorization") String token);
    @GET("characters/")
    Observable<List<String>> getCharactersToken(@Query("access_token") String token);

    @GET("characters")
    Observable<List<String>> getAccountCharacters(@Header("Authorization") String token,
                                                  @Query("page") String page);
    @GET("characters/")
    Observable<List<String>> getAccountCharactersToken(@Query("access_token") String token,
                                                       @Query("page") String page);

    @GET("characters/{id}")
    Observable<CharacterOverviewResponse> getCharacter(@Header("Authorization") String token,
                                                       @Path("id") String id);
    @GET("characters/")
    Observable<List<String>> getCharacterToken(@Query("access_token") String token);

    @GET("characters/{id}/backstory")
    Observable<CharacterBackstoryResponse> getCharacterBackstory(@Header("Authorization") String token,
                                                                 @Path("id") String id);
    @GET("characters/{id}/backstory")
    Observable<CharacterBackstoryResponse> getCharacterBackstoryToken(@Path("id") String id,
                                                                      @Query("access_token") String token);

    @GET("characters/{id}/core")
    Observable<CharacterCoreResponse> getCharacterCore(@Header("Authorization") String token,
                                                       @Path("id") String id);
    @GET("characters/{id}/core")
    Observable<CharacterCoreResponse> getCharacterCoreToken(@Path("id") String id,
                                                            @Query("access_token") String token);

    @GET("characters/{id}/crafting")
    Observable<CharacterCraftingResponse> getCharacterCrafting(@Header("Authorization") String token,
                                                               @Path("id") String id);
    @GET("characters/{id}/crafting")
    Observable<CharacterCraftingResponse> getCharacterCraftingToken(@Path("id") String id,
                                                                    @Query("access_token") String token);

    @GET("characters/{id}/equipment")
    Observable<CharacterEquipmentResponse> getCharacterEquipment(@Header("Authorization") String token,
                                                                 @Path("id") String id);
    @GET("characters/{id}/equipment")
    Observable<CharacterEquipmentResponse> getCharacterEquipmentToken(@Path("id") String id,
                                                                      @Query("access_token") String token);

    @GET("characters/{id}/heropoints")
    Observable<List<String>> getCharacterHeropoints(@Header("Authorization") String token,
                                                    @Path("id") String id);
    @GET("characters/{id}/heropoints")
    Observable<List<String>> getCharacterHeropointsToken(@Path("id") String id,
                                                         @Query("access_token") String token);

    @GET("characters/{id}/inventory")
    Observable<CharacterInventoryResponse> getCharacterInventory(@Header("Authorization") String token,
                                                                 @Path("id") String id);
    @GET("characters/{id}/inventory")
    Observable<CharacterInventoryResponse> getCharacterInventoryToken(@Path("id") String id,
                                                                      @Query("access_token") String token);

    @GET("characters/{id}/recipes")
    Observable<List<Integer>> getCharacterRecipes(@Header("Authorization") String token,
                                                  @Path("id") String id);
    @GET("characters/{id}/recipes")
    Observable<List<Integer>> getCharacterRecipesToken(@Path("id") String id,
                                                       @Query("access_token") String token);

    @GET("characters/{id}/skills")
    Observable<CharacterSkillsResponse> getCharacterSkills(@Header("Authorization") String token,
                                                           @Path("id") String id);
    @GET("characters/{id}/skills")
    Observable<CharacterSkillsResponse> getCharacterSkillsToken(@Path("id") String id,
                                                                @Query("access_token") String token);

    @GET("characters/{id}/specializations")
    Observable<CharacterSpecializationsResponse> getCharacterSpecializations(@Header("Authorization") String token,
                                                                             @Path("id") String id);
    @GET("characters/{id}/specializations")
    Observable<CharacterSpecializationsResponse> getCharacterSpecializationsToken(@Path("id") String id,
                                                                                  @Query("access_token") String token);

    @GET("characters/{id}/training")
    Observable<CharacterTrainingResponse> getCharacterTraining(@Header("Authorization") String token,
                                                               @Path("id") String id);
    @GET("characters/{id}/training")
    Observable<CharacterTrainingResponse> getCharacterTrainingToken(@Path("id") String id,
                                                                    @Query("access_token") String token);

    // COLORS:
    @GET("colors")
    Observable<ColorResponse> getColors(@Nullable @Query("lang") String lang);

    // COMMERCE/EXCHANGE:
    @GET("commerce/exchange")
    Observable<List<String>> getCommerceExchangeEndpoints();

    // COMMERCE/EXCHANGE/COINS:
    @GET("commerce/exchange/coins")
    Observable<CommerceExchangeResponse> getCommerceExchangeCoins(@Query("quantity") Integer quantity);

    // COMMERCE/EXCHANGE/GEMS:
    @GET("commerce/exchange/gems")
    Observable<CommerceExchangeResponse> getCommerceExchangeGems(@Query("quantity") Integer quantity);

    // COMMERCE/LISTINGS
    @GET("commerce/listings")
    Observable<List<CommerceListingsResponse>> getCommerceListingsList(@Nullable @Query("ids") String ids);

    @GET("commerce/listings/{id}")
    Observable<CommerceListingsResponse> getCommerceListing(@Path("id") String id);

    // COMMERCE/PRICE
    @GET("commerce/prices")
    Observable<List<CommercePricesResponse>> getCommercePricesList(@Nullable @Query("ids") String ids);

    @GET("commerce/prices/{id}")
    Observable<CommercePricesResponse> getCommercePrice(@Path("id") String id);

    // COMMERCE/TRANSACTIONS:
    @GET("commerce/transactions")
    Observable<List<String>> getTransactionSecondaryEndpoints(@Header("Authorization") String token);

    // COMMERCE/TRANSACTIONS: ["current" | "history"]
    @GET("commerce/transactions/{secondary}")
    Observable<List<String>> getTransactionTertiaryEndpoints(@Header("Authorization") String token,
                                                             @Path("secondary") String secondary);

    // COMMERCE/TRANSACTIONS: ["current/buys" | "current/sells" | "history/buys" | "history/sells"]
    @GET("commerce/transactions/{secondary}/{tertiary}")
    Observable<CommerceTransactionsResponse> getTransactions(@Header("Authorization") String token,
                                                             @Path("secondary") String secondary,
                                                             @Path("tertiary") String tertiary);

    // EMBLEM:
    @GET("emblem")
    Observable<List<Integer>> getEmblem();

    @GET("emblem")
    Observable<EmblemResponse> getEmblemIds(@Query("ids") String ids);

    // ITEMS:
    @GET("items")
    Observable<List<Integer>> getItems();

    @GET("items/{id}")
    Observable<ItemResponse> getItem(@Path("id") String id);

    // QUAGGANS:
    @GET("quaggans")
    Observable<List<String>> getQuaggans();

    @GET("quaggans")
    Observable<List<QuaggansResponse>> getQuaggans(@Query("ids") String ids);

    @GET("quaggans/{id}")
    Observable<QuaggansResponse> getQuagganId(@Path("id") String id);

    // TOKEN INFO:
    @GET("tokeninfo")
    Observable<TokenInfoResponse> getTokenInfo(@Header("Authorization") String token);

    @GET("tokeninfo")
    Observable<TokenInfoResponse> getTokenInfoToken(@Query("access_token") String token);

    // WORLDS:
    @GET("worlds")
    Observable<List<Integer>> getWorldList();

    @GET("worlds")
    Observable<List<WorldsResponse>> getWorlds(@Nullable @Query("ids") String ids);

    @GET("worlds")
    Observable<List<WorldsResponse>> getLocalizedWorlds(@Nullable @Query("lang") String lang);
}
