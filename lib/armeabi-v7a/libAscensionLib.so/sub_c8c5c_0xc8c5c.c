// 函数: sub_c8c5c
// 地址: 0xc8c5c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r2 = *(arg1 + 0x40)
void* r2_1

if (r2 != 0)
    *(r2 + 0x104) = arg2
    arg1, r2_1 = longjmp(r2 + 4, 1)
else
    void* r12_1 = *(arg1 + 0xc)
    *(arg1 + 6) = arg2.b
    r2_1 = *(r12_1 + 0xac)
    
    if (*(r2_1 + 0x40) == 0)
        int32_t r1 = *(r12_1 + 0xa8)
        
        if (r1 != 0)
            r1()
        
        abort()
        noreturn

int32_t* lr = *(r2_1 + 8)
int32_t r12_2 = *(arg1 + 8)
*(r2_1 + 8) = &lr[4]
int32_t r3_3 = *(r12_2 - 0xc)
*lr = *(r12_2 - 0x10)
lr[1] = r3_3
lr[2] = *(r12_2 - 8)
void* r0_3
int32_t r1_1
int32_t r2_4
r0_3, r1_1, r2_4 = sub_c8c5c(*(*(arg1 + 0xc) + 0xac))
return sub_c8cdc(r0_3, r1_1, r2_4) __tailcall
