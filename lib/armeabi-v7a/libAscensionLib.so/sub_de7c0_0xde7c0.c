// 函数: sub_de7c0
// 地址: 0xde7c0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r7 = arg2
int32_t r1 = arg2[2]
void* r2_2

for (int32_t i = 0; i u<= 0x63; )
    int32_t* r0_4
    
    if (r1 != 0x45)
        r0_4 = sub_dc704(arg1, r7, 0)
        r2_2 = &r0_4[2]
        r1 = *r2_2
        
        if (r1 == 0)
            sub_c841c(arg1, r7, "index")
            noreturn
    else
        void* r6_1 = *r7
        int128_t q4
        int32_t* r0_1 = sub_db788(r6_1, arg3, arg1, q4)
        
        if (r0_1[2] != 0)
        label_de894:
            int32_t r1_5 = r0_1[1]
            *arg4 = *r0_1
            arg4[1] = r1_5
            int32_t r0_8 = r0_1[2]
            arg4[2] = r0_8
            return r0_8
        
        void* r0_3 = *(r6_1 + 8)
        
        if (r0_3 == 0 || (zx.d(*(r0_3 + 6)) & 1) != 0)
            goto label_de894
        
        r0_4 = sub_dc6c8(r0_3, 0, *(arg1[3] + 0xb8))
        
        if (r0_4 == 0)
            goto label_de894
        
        r2_2 = &r0_4[2]
        r1 = *r2_2
    
    if ((r1 & 0xf) == 6)
        int32_t* r1_6 = arg1[2]
        int32_t r4_2 = arg1[7]
        arg1[2] = &r1_6[4]
        int32_t r3_2 = r0_4[1]
        *r1_6 = *r0_4
        r1_6[1] = r3_2
        r1_6[2] = *r2_2
        int32_t* r0_11 = arg1[2]
        arg1[2] = &r0_11[4]
        int32_t r2_4 = r7[1]
        *r0_11 = *r7
        r0_11[1] = r2_4
        r0_11[2] = r7[2]
        int32_t* r0_12 = arg1[2]
        arg1[2] = &r0_12[4]
        int32_t r2_5 = arg3[1]
        *r0_12 = *arg3
        r0_12[1] = r2_5
        r0_12[2] = arg3[2]
        sub_c9774(arg1, arg1[2] - 0x30, 1, zx.d(*(arg1[4] + 0x12)) & 1, arg4)
        int32_t r0_15 = arg1[2]
        void* r1_15 = arg1[7]
        arg1[2] = r0_15 - 0x10
        int32_t r3_4 = *(r0_15 - 0xc)
        int32_t* r1_16 = r1_15 + arg4 - r4_2
        *r1_16 = *(r0_15 - 0x10)
        r1_16[1] = r3_4
        int32_t r0_16 = *(r0_15 - 8)
        r1_16[2] = r0_16
        return r0_16
    
    i += 1
    r7 = r0_4

sub_c89f0(arg1, "loop in gettable", r2_2)
noreturn
