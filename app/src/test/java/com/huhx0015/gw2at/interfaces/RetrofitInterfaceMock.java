package com.huhx0015.gw2at.interfaces;

import com.android.annotations.Nullable;
import com.huhx0015.gw2at.data.MockResponseUtils;
import com.huhx0015.gw2at.models.responses.BuildResponse;
import com.huhx0015.gw2at.models.responses.EmblemResponse;
import com.huhx0015.gw2at.models.responses.QuaggansResponse;
import com.huhx0015.gw2at.models.responses.TokenInfoResponse;
import com.huhx0015.gw2at.models.responses.WalletResponse;
import com.huhx0015.gw2at.models.responses.WorldsResponse;
import com.huhx0015.gw2at.models.responses.account.AccountAchievementsResponse;
import com.huhx0015.gw2at.models.responses.account.AccountBankResponse;
import com.huhx0015.gw2at.models.responses.account.AccountFinishersResponse;
import com.huhx0015.gw2at.models.responses.account.AccountInventoryResponse;
import com.huhx0015.gw2at.models.responses.account.AccountMasteriesResponse;
import com.huhx0015.gw2at.models.responses.account.AccountMaterialsResponse;
import com.huhx0015.gw2at.models.responses.account.AccountResponse;
import com.huhx0015.gw2at.models.responses.achievements.AchievementsCategoriesResponse;
import com.huhx0015.gw2at.models.responses.achievements.AchievementsDailyResponse;
import com.huhx0015.gw2at.models.responses.achievements.AchievementsGroupResponse;
import com.huhx0015.gw2at.models.responses.achievements.AchievementsResponse;
import com.huhx0015.gw2at.models.responses.backstory.BackstoryAnswerResponse;
import com.huhx0015.gw2at.models.responses.backstory.BackstoryQuestionResponse;
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
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Michael Yoon Huh on 2/1/2017.
 */

public class RetrofitInterfaceMock implements RetrofitInterface {

    @Override
    public Observable<AccountResponse> getAccount(@Header("Authorization") String bearer) {
        return null;
    }

    @Override
    public Observable<AccountResponse> getAccountToken(@Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<AccountAchievementsResponse> getAccountAchievements(@Header("Authorization") String bearer) {
        return null;
    }

    @Override
    public Observable<AccountAchievementsResponse> getAccountAchievementsToken(@Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<AccountBankResponse> getAccountBank(@Header("Authorization") String bearer) {
        return null;
    }

    @Override
    public Observable<AccountBankResponse> getAccountBankToken(@Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<List<Integer>> getAccountDyes(@Header("Authorization") String bearer) {
        return null;
    }

    @Override
    public Observable<List<Integer>> getAccountDyesToken(@Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<AccountFinishersResponse> getAccountFinishers(@Header("Authorization") String bearer) {
        return null;
    }

    @Override
    public Observable<AccountFinishersResponse> getAccountFinishersToken(@Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<AccountInventoryResponse> getAccountInventory(@Header("Authorization") String bearer) {
        return null;
    }

    @Override
    public Observable<AccountInventoryResponse> getAccountInventoryToken(@Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<AccountMasteriesResponse> getAccountMasteries(@Header("Authorization") String bearer) {
        return null;
    }

    @Override
    public Observable<AccountMasteriesResponse> getAccountMasteriesToken(@Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<AccountMaterialsResponse> getAccountMaterials(@Header("Authorization") String bearer) {
        return null;
    }

    @Override
    public Observable<AccountMaterialsResponse> getAccountMaterialsToken(@Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<List<Integer>> getAccountMinis(@Header("Authorization") String bearer) {
        return null;
    }

    @Override
    public Observable<List<Integer>> getAccountMinisToken(@Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<List<Integer>> getAccountOutfits(@Header("Authorization") String bearer) {
        return null;
    }

    @Override
    public Observable<List<Integer>> getAccountOutfitsToken(@Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<List<Integer>> getAccountRecipes(@Header("Authorization") String bearer) {
        return null;
    }

    @Override
    public Observable<List<Integer>> getAccountRecipesToken(@Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<List<Integer>> getAccountSkins(@Header("Authorization") String bearer) {
        return null;
    }

    @Override
    public Observable<List<Integer>> getAccountSkinsToken(@Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<List<Integer>> getAccountTitles(@Header("Authorization") String bearer) {
        return null;
    }

    @Override
    public Observable<List<Integer>> getAccountTitlesToken(@Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<WalletResponse> getAccountWallet(@Header("Authorization") String bearer) {
        return null;
    }

    @Override
    public Observable<WalletResponse> getAccountWalletToken(@Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<AchievementsResponse> getAchievements(@Nullable @Query("lang") String lang) {
        return null;
    }

    @Override
    public Observable<AchievementsCategoriesResponse> getAchievementsCategories(@Path("id") String id, @Nullable @Query("lang") String lang) {
        return null;
    }

    @Override
    public Observable<AchievementsDailyResponse> getAchievementsDaily() {
        return null;
    }

    @Override
    public Observable<AchievementsDailyResponse> getAchievementsDailyTomorrow() {
        return null;
    }

    @Override
    public Observable<AchievementsGroupResponse> getAchievementsGroup(@Path("id") String id, @Nullable @Query("lang") String lang) {
        return null;
    }

    @Override
    public Observable<List<String>> getBackstoryAnswers() {
        return null;
    }

    @Override
    public Observable<BackstoryAnswerResponse> getBackstoryAnswerId(@Path("id") String id, @Nullable @Query("lang") String lang, @Nullable @Query("page") Integer page, @Nullable @Query("page_size") String page_size) {
        return null;
    }

    @Override
    public Observable<List<BackstoryAnswerResponse>> getBackstoryAnswerIds(@Query("ids") String ids, @Nullable @Query("lang") String lang, @Nullable @Query("page") Integer page, @Nullable @Query("page_size") String page_size) {
        return null;
    }

    @Override
    public Observable<List<Integer>> getBackstoryQuestions(@Nullable @Query("lang") String lang) {
        return null;
    }

    @Override
    public Observable<BackstoryQuestionResponse> getBackstoryQuestionId(@Path("id") String id, @Nullable @Query("lang") String lang, @Nullable @Query("page") Integer page, @Nullable @Query("page_size") String page_size) {
        return null;
    }

    @Override
    public Observable<List<BackstoryQuestionResponse>> getBackstoryQuestionIds(@Query("ids") String ids, @Nullable @Query("lang") String lang, @Nullable @Query("page") Integer page, @Nullable @Query("page_size") String page_size) {
        return null;
    }

    @Override
    public Observable<BuildResponse> getBuild() {
        return null;
    }

    @Override
    public Observable<List<String>> getCharacters(@Header("Authorization") String bearer) {
        return null;
    }

    @Override
    public Observable<List<String>> getCharactersToken(@Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<List<String>> getAccountCharacters(@Header("Authorization") String bearer, @Query("page") String page) {
        return null;
    }

    @Override
    public Observable<List<String>> getAccountCharactersToken(@Query("access_token") String token, @Query("page") String page) {
        return null;
    }

    @Override
    public Observable<CharacterOverviewResponse> getCharacter(@Header("Authorization") String bearer, @Path("id") String id) {
        return null;
    }

    @Override
    public Observable<List<String>> getCharacterToken(@Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<CharacterBackstoryResponse> getCharacterBackstory(@Header("Authorization") String bearer, @Path("id") String id) {
        return null;
    }

    @Override
    public Observable<CharacterBackstoryResponse> getCharacterBackstoryToken(@Path("id") String id, @Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<CharacterCoreResponse> getCharacterCore(@Header("Authorization") String bearer, @Path("id") String id) {
        return null;
    }

    @Override
    public Observable<CharacterCoreResponse> getCharacterCoreToken(@Path("id") String id, @Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<CharacterCraftingResponse> getCharacterCrafting(@Header("Authorization") String bearer, @Path("id") String id) {
        return null;
    }

    @Override
    public Observable<CharacterCraftingResponse> getCharacterCraftingToken(@Path("id") String id, @Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<CharacterEquipmentResponse> getCharacterEquipment(@Header("Authorization") String bearer, @Path("id") String id) {
        return null;
    }

    @Override
    public Observable<CharacterEquipmentResponse> getCharacterEquipmentToken(@Path("id") String id, @Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<List<String>> getCharacterHeropoints(@Header("Authorization") String bearer, @Path("id") String id) {
        return null;
    }

    @Override
    public Observable<List<String>> getCharacterHeropointsToken(@Path("id") String id, @Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<CharacterInventoryResponse> getCharacterInventory(@Header("Authorization") String bearer, @Path("id") String id) {
        return null;
    }

    @Override
    public Observable<CharacterInventoryResponse> getCharacterInventoryToken(@Path("id") String id, @Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<List<Integer>> getCharacterRecipes(@Header("Authorization") String bearer, @Path("id") String id) {
        return null;
    }

    @Override
    public Observable<List<Integer>> getCharacterRecipesToken(@Path("id") String id, @Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<CharacterSkillsResponse> getCharacterSkills(@Header("Authorization") String bearer, @Path("id") String id) {
        return null;
    }

    @Override
    public Observable<CharacterSkillsResponse> getCharacterSkillsToken(@Path("id") String id, @Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<CharacterSpecializationsResponse> getCharacterSpecializations(@Header("Authorization") String bearer, @Path("id") String id) {
        return null;
    }

    @Override
    public Observable<CharacterSpecializationsResponse> getCharacterSpecializationsToken(@Path("id") String id, @Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<CharacterTrainingResponse> getCharacterTraining(@Header("Authorization") String bearer, @Path("id") String id) {
        return null;
    }

    @Override
    public Observable<CharacterTrainingResponse> getCharacterTrainingToken(@Path("id") String id, @Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<ColorResponse> getColors(@Nullable @Query("lang") String lang) {
        return null;
    }

    @Override
    public Observable<List<String>> getCommerceExchangeEndpoints() {
        return null;
    }

    @Override
    public Observable<CommerceExchangeResponse> getCommerceExchangeCoins(@Query("quantity") Integer quantity) {
        return null;
    }

    @Override
    public Observable<CommerceExchangeResponse> getCommerceExchangeGems(@Query("quantity") Integer quantity) {
        return null;
    }

    @Override
    public Observable<List<CommerceListingsResponse>> getCommerceListingsList(@Nullable @Query("ids") String ids) {
        return null;
    }

    @Override
    public Observable<CommerceListingsResponse> getCommerceListing(@Path("id") String id) {
        return null;
    }

    @Override
    public Observable<List<CommercePricesResponse>> getCommercePricesList(@Nullable @Query("ids") String ids) {
        return null;
    }

    @Override
    public Observable<CommercePricesResponse> getCommercePrice(@Path("id") String id) {
        return null;
    }

    @Override
    public Observable<List<String>> getTransactionSecondaryEndpoints(@Header("Authorization") String bearer) {
        return null;
    }

    @Override
    public Observable<List<String>> getTransactionTertiaryEndpoints(@Header("Authorization") String bearer, @Path("secondary") String secondary) {
        return null;
    }

    @Override
    public Observable<CommerceTransactionsResponse> getTransactions(@Header("Authorization") String bearer, @Path("secondary") String secondary, @Path("tertiary") String tertiary) {
        return null;
    }

    @Override
    public Observable<List<Integer>> getEmblem() {
        return null;
    }

    @Override
    public Observable<EmblemResponse> getEmblemIds(@Query("ids") String ids) {
        return null;
    }

    @Override
    public Observable<List<Integer>> getItems() {
        return null;
    }

    @Override
    public Observable<ItemResponse> getItem(@Path("id") String id) {
        return null;
    }

    @Override
    public Observable<List<String>> getQuaggans() {
        return null;
    }

    @Override
    public Observable<List<QuaggansResponse>> getQuaggans(@Query("ids") String ids) {
        return Observable.just(MockResponseUtils.getMockQuaggansResponse());
    }

    @Override
    public Observable<QuaggansResponse> getQuagganId(@Path("id") String id) {
        return null;
    }

    @Override
    public Observable<TokenInfoResponse> getTokenInfo(@Header("Authorization") String bearer) {
        return null;
    }

    @Override
    public Observable<TokenInfoResponse> getTokenInfoToken(@Query("access_token") String token) {
        return null;
    }

    @Override
    public Observable<List<Integer>> getWorldList() {
        return null;
    }

    @Override
    public Observable<List<WorldsResponse>> getWorlds(@Nullable @Query("ids") String ids) {
        return null;
    }

    @Override
    public Observable<List<WorldsResponse>> getLocalizedWorlds(@Nullable @Query("lang") String lang) {
        return null;
    }
}
