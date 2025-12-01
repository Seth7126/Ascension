// 函数: _Z28RestoreAppGameDataFromBufferP12AppWorldDataPc
// 地址: 0x1876b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* s1 = arg2

if (strncmp(s1, "PLAYDEK", 8) != 0)
    goto label_1876f8

int32_t result = *(s1 + 8)

if (result == 1)
    s1 = &s1[0xc]
label_1876f8:
    __aeabi_memcpy(arg1, s1, 0x11c)
    int32_t r6_1 = 0x800
    *(arg1 + 0x11c) = 0
    int32_t r4_1 = 0x80
    *(arg1 + 0x120) = 0
    int32_t r5_1 = *(arg1 + 0x10c)
    *(arg1 + 0x10c) = 0
    
    do
        r4_1 += 0x80
        r6_1 += 0x800
    while (r5_1 s>= r4_1)
    
    uint32_t r0_3
    int32_t r1_1
    r1_1:r0_3 = mulu.dp.d(r4_1, 0x10)
    
    if (r1_1 != 0)
        r1_1 = 1
    
    if (r1_1 != 0)
        r0_3 = 0xffffffff
    
    int32_t r0_4 = operator new[](r0_3)
    __aeabi_memclr4(r0_4, r6_1)
    *(arg1 + 0x11c) = r4_1
    *(arg1 + 0x120) = r0_4
    result = __aeabi_memcpy(r0_4, &s1[0x120], r5_1 << 4)
    *(arg1 + 0x10c) = r5_1

return result
