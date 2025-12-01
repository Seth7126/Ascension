// 函数: _ZN14ascensionrules25CanAcquireHeroOrConstructEP9lua_State
// 地址: 0x155fc0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

lua_pushboolean(arg1, 
    ascensionrules::CanAcquireHeroOrConstruct(lua_touserdata(arg1, 1), false, true, true, 0, 
        lua_tointegerx(arg1, 2, 0), false))
return 1
