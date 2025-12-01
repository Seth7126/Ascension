// 函数: _ZN9ascension5CCard14GetCardFactionEP9lua_State
// 地址: 0xe3ed8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0_1 = *(lua_touserdata(arg1, 1) + 0x8c)
void* r1

if ((r0_1 & 2) == 0)
    if ((r0_1 & 4) == 0)
        if ((r0_1 & 8) == 0)
            if ((r0_1 & 0x10) != 0)
                r1 = &(*"none")[4 << 4]
            else
                r1 = "none"
        else
            r1 = &(*"none")[3 << 4]
    else
        r1 = &(*"none")[2 << 4]
else
    r1 = &(*"none")[1 << 4]

lua_pushstring(arg1, r1)
return 1
