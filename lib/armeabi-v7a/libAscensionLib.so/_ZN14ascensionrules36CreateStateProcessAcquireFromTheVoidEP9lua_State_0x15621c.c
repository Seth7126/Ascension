// 函数: _ZN14ascensionrules36CreateStateProcessAcquireFromTheVoidEP9lua_State
// 地址: 0x15621c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

lua_pushlightuserdata(arg1, 
    ascensionrules::CreateStateProcessAcquireFromTheVoid(lua_touserdata(arg1, 1), 
        ascension::GetCardTypeFromString(lua_tolstring(arg1, 2, 0)), 
        ascension::GetCardFactionFromString(lua_tolstring(arg1, 3, 0))))
return 1
