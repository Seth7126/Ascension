// 函数: _ZN14ascensionrules38CreateStateProcessChooseEffectFromListEP9lua_State
// 地址: 0x156c08
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r0 = lua_touserdata(arg1, 1)
ascension::CEffectList* r0_4

if (lua_isnumber(arg1, 2) == 0)
    r0_4 = lua_touserdata(arg1, 2)
else
    r0_4 = lua_tointegerx(arg1, 2, 0)

lua_pushlightuserdata(arg1, 
    ascensionrules::CreateStateProcessChooseEffectFromList(r0, r0_4, lua_touserdata(arg1, 3), 
        lua_touserdata(arg1, 4)))
return 1
