// 函数: _ZN9ascension26CCardInPlayAbilityInstance21GetCardInPlayInstanceEP9lua_State
// 地址: 0xea5b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = lua_touserdata(arg1, 1)
int32_t r5 = 0

if (r0 != 0)
    void* r0_1 = __dynamic_cast(r0, _typeinfo_for_core::CInstance, 
        _typeinfo_for_ascension::CCardInPlayAbilityInstance, 0)
    
    if (r0_1 != 0)
        r5 = *(r0_1 + 0xc)

lua_pushlightuserdata(arg1, r5)
return 1
