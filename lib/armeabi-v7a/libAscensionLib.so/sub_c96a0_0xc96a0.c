// 函数: sub_c96a0
// 地址: 0xc96a0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r0 = zx.d(arg1[0xa].b)
int32_t* r6 = arg1[4]
int32_t* r5 = arg2
void* r2_2

if ((r0 & 6) == 0)
    r2_2 = r6[2]
else
    if ((r0 & 2) != 0)
        int32_t r7_1 = arg1[7]
        sub_c8f90(arg1, 1)
        r5 = arg1[7] + r5 - r7_1
    
    r2_2 = r6[2]
    arg1[5] = *(r2_2 + 0x1c)

int32_t i_2 = sx.d(r6[4].w)
void* r1_1 = *r6
arg1[4] = r2_2

if (i_2 != 0)
    int32_t i_1 = i_2
    int32_t i
    
    do
        if (r5 u>= arg1[2])
            if (i_1 s>= 1)
                int32_t j = i_1 + 1
                
                do
                    *(r1_1 + 8) = 0
                    j -= 1
                    r1_1 += 0x10
                while (j s> 1)
            
            break
        
        int32_t r7_2 = r5[1]
        i = i_1
        i_1 -= 1
        int32_t* temp0_2 = r1_1
        *temp0_2 = *r5
        temp0_2[1] = r7_2
        int32_t r3_3 = r5[2]
        r5 = &r5[4]
        *(r1_1 + 8) = r3_3
        r1_1 += 0x10
    while (i != 1)

arg1[2] = r1_1
return i_2 + 1
