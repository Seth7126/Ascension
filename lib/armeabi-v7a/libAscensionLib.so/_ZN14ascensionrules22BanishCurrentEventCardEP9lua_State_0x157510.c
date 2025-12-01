// 函数: _ZN14ascensionrules22BanishCurrentEventCardEP9lua_State
// 地址: 0x157510
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CCardInPlayInstance* r0 = lua_touserdata(arg1, 1)
int32_t r1 = *(r0 + 0xa6c)

if (r1 != 0)
    ascension::CWorld::RemoveEventCardInPlay(r0, r1.b)

return 0
