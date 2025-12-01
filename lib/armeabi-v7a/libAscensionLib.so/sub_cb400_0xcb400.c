// 函数: sub_cb400
// 地址: 0xcb400
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r9 = arg1
void* r0 = arg1[3]
int32_t* result = arg2
char r7 = -0x48
uint32_t r3 = zx.d(*(r0 + 0x3e))
uint32_t r1 = zx.d(*(r0 + 0x3c))
int32_t* i_1 = *result

if (r3 == 2)
    r7 = -1

char r7_1 = r1.b & 3

if (r3 == 2)
    r7_1 = 0x40

if (i_1 != 0)
    int32_t r4_1 = r1 ^ 3
    int32_t temp0_1 = 0
    uint32_t i = r3 - 2
    
    while (i != 0)
        i u>>= 1
        temp0_1 += 1
    
    int32_t r10_1 = not.d(arg3)
    
    do
        int32_t temp2_1 = r10_1
        r10_1 += 1
        
        if (temp2_1 == 0xffffffff)
            return result
        
        uint32_t r8_1 = zx.d(*(i_1 + 5))
        int32_t* r6_1 = i_1
        
        if (((r8_1 ^ 3) & r4_1) == 0)
            i_1 = *r6_1
            *result = i_1
            
            switch (zx.d(r6_1[1].b) - 4)
                case 0
                    void* r0_13 = r9[3]
                    *(r0_13 + 0x1c) -= 1
                label_cb5ac:
                    r4_1, result, r9 = sub_d14cc(r9, r6_1, r6_1[3] + 0x11, 0)
                    i_1 = *result
                case 1
                    r9 = sub_db000(r9, r6_1)
                    i_1 = *result
                case 2
                    r4_1, result, r9 = sub_d14cc(r9, r6_1, 0x10 + (zx.d(*(r6_1 + 6)) << 2), 0)
                    i_1 = *result
                case 3
                    r4_1, result, r9 = sub_d14cc(r9, r6_1, r6_1[4] + 0x18, 0)
                    i_1 = *result
                case 4
                    r9 = sub_d7740(r9, r6_1)
                    i_1 = *result
                case 5
                    r9 = sub_cacb8(r9, r6_1)
                    i_1 = *result
                case 6
                    r9 = sub_cab40(r9, r6_1)
                    i_1 = *result
                case 0x10
                    goto label_cb5ac
                case 0x22
                    r4_1, result, r9 = sub_d14cc(r9, r6_1, 0x10 + (zx.d(*(r6_1 + 6)) << 4), 0)
                    i_1 = *result
        else
            if (((0x20 - temp0_1) u>> 5 << 6 & r8_1) != 0)
                break
            
            if (zx.d(r6_1[1].b) == 8 && r6_1[7] != 0)
                sub_cb400(r9, &r6_1[0xe], 0xfffffffd)
                r9 = sub_d753c(r6_1)
                
                if (zx.d(*(r9[3] + 0x3e)) != 1)
                    r9 = sub_c8f18(r6_1)
            
            result = r6_1
            *(r6_1 + 5) = (r8_1.b & r7) | r7_1
            i_1 = *result
    while (i_1 != 0)

return nullptr
