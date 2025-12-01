// 函数: sub_c9e5c
// 地址: 0xc9e5c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r8 = arg1[0x11]
arg1[9].w
char r10 = *(arg1 + 0x29)
void* i = arg1[4]
arg1[0x11] = arg5
int32_t result = sub_c8cdc(arg1, arg2, arg3)

if (result != 0)
    void** r6_1 = arg1[7] + arg4
    int16_t r9_1 = sub_cab68(arg1, r6_1)
    int32_t r0_8
    void* r0_5
    
    if (result == 6)
        r0_5 = sub_d7eb4(arg1, "error in error handling", 0x17)
        *r6_1 = r0_5
        r0_8 = zx.d(*(r0_5 + 4)) | 0x40
    else if (result != 4)
        int32_t r0_9 = arg1[2]
        *r6_1 = (*(r0_9 - 0xc)):(*(r0_9 - 0x10))
        r0_8 = *(r0_9 - 8)
    else
        r0_5 = *(arg1[3] + 0xb4)
        *r6_1 = r0_5
        r0_8 = zx.d(*(r0_5 + 4)) | 0x40
    r6_1[2] = r0_8
    void* r0_10 = &r6_1[4]
    arg1[4] = i
    arg1[2] = r0_10
    *(arg1 + 0x29) = r10
    arg1[9].w = r9_1
    
    while (i != 0)
        void* r1_1 = *(i + 4)
        i = *(i + 8)
        
        if (r0_10 u< r1_1)
            r0_10 = r1_1
    
    void* r0_11 = r0_10 - arg1[7]
    int32_t r1_6 = 0xf4240
    
    if ((r0_11 s>> 4) + ((1 + (r0_11 s>> 4) + ((1 + (r0_11 s>> 4)) s>> 0x1f u>> 0x1d)) s>> 3) + 0xb
            s< 0xf4240)
        r1_6 = (r0_11 s>> 4) + ((1 + (r0_11 s>> 4) + ((1 + (r0_11 s>> 4)) s>> 0x1f u>> 0x1d)) s>> 3)
            + 0xb
    
    bool cond:0_1 = r0_11 s< 0xf423f0
    
    if (r0_11 s<= 0xf423f0)
        cond:0_1 = r1_6 s< arg1[8]
    
    if (cond:0_1)
        sub_c8d68(arg1, r1_6)
        undefined

arg1[0x11] = r8
return result
