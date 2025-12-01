// 函数: luaL_addlstring
// 地址: 0xc1004
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *(arg1 + 4)
int32_t r0 = *(arg1 + 8)
int32_t r6

if (r1 - r0 u>= arg3)
    r6 = *arg1
else
    int32_t r2_1 = (r1 << 1) - r0
    int32_t r7_1 = r1 << 1
    int32_t r9_1 = *(arg1 + 0xc)
    
    if (r2_1 u< arg3)
        r7_1 = r0 + arg3
    
    if (r7_1 u< r0 || r7_1 - r0 u< arg3)
        luaL_error(r9_1, "buffer too large", r2_1)
    
    int32_t r0_4 = lua_newuserdata(r9_1, r7_1)
    r6 = r0_4
    __aeabi_memcpy(r0_4, *arg1, *(arg1 + 8))
    
    if (*arg1 != arg1 + 0x10)
        lua_remove(r9_1, 0xfffffffe)
    
    r0 = *(arg1 + 8)
    *arg1 = r6
    *(arg1 + 4) = r7_1

__aeabi_memcpy(r6 + r0, arg2, arg3)
int32_t result = *(arg1 + 8) + arg3
*(arg1 + 8) = result
return result
