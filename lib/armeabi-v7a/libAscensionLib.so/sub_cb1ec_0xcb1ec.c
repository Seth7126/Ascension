// 函数: sub_cb1ec
// 地址: 0xcb1ec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r6 = arg1[3]
uint32_t r0 = zx.d(*(r6 + 0x3e))

if (r0 != arg2)
    if (arg2 == 2)
        while (zx.d(*(r6 + 0x3d)) != 0)
            sub_cb648(arg1)
        
        int32_t r0_6
        int32_t r1_2
        r1_2:r0_6 = *(r6 + 8)
        *(r6 + 0x3e) = 2
        int32_t r0_7 = r1_2 + r0_6
        *(r6 + 0x14) = r0_7
        return r0_7
    
    *(r6 + 0x40) = 0
    *(r6 + 0x3d) = 2
    int32_t* i
    
    do
        i = sub_cb400(arg1, r6 + 0x48, 1)
    while (i == r6 + 0x48)
    
    *(r6 + 0x50) = i
    int32_t* i_1
    
    do
        i_1 = sub_cb400(arg1, r6 + 0x44, 1)
    while (i_1 == r6 + 0x44)
    
    *(r6 + 0x4c) = i_1
    void* r5_3 = arg1[3]
    r0 = zx.d(*(r5_3 + 0x3d))
    
    while ((0xffffffe3 & 1 << (r0 & 0xff)) == 0)
        sub_cb648(arg1)
        r0 = zx.d(*(r5_3 + 0x3d))

return r0
