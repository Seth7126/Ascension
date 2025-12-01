// 函数: _ZN9ascension26CCardInPlayAbilityInstance27IsCardInPlayAbilityInstanceEP9lua_State
// 地址: 0xea550
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = lua_touserdata(arg1, 1)
int32_t r1_1

if (r0 == 0)
    r1_1 = 0
else
    int32_t r0_1 = __dynamic_cast(r0, _typeinfo_for_core::CInstance, 
        _typeinfo_for_ascension::CCardInPlayAbilityInstance, 0)
    r1_1 = r0_1
    
    if (r0_1 != 0)
        r1_1 = 1

lua_pushboolean(arg1, r1_1)
return 1
