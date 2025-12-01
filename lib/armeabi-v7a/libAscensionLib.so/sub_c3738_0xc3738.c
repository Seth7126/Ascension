// 函数: sub_c3738
// 地址: 0xc3738
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = luaL_checkunsigned(arg1, 1)
int32_t r0_2 = luaL_checkinteger(arg1, 2)
uint32_t r1

if (r0 s<= 0xffffffff && r0_2 s> 0xffffffff)
    r1 = 0xffffffff
    
    if (r0_2 s<= 0x1f)
        r1 = not.d(0xffffffff u>> (r0_2 & 0xff)) | r0 u>> (r0_2 & 0xff)
else if (r0_2 s< 1)
    r1 = r0 << (0 - r0_2)
    
    if (r0_2 s< 0xffffffe1)
        r1 = 0
else
    r1 = r0 u>> r0_2
    
    if (r0_2 s> 0x1f)
        r1 = 0

lua_pushunsigned(arg1, r1)
return 1
