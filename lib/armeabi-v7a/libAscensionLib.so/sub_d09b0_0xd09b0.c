// 函数: sub_d09b0
// 地址: 0xd09b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r4 = 0
*(*(arg1 + 0x3c) + 4) = 0
sub_d0344(arg1, 0x5c)

if (arg3 s>= 1)
    do
        int32_t r1 = *(arg2 + (r4 << 2))
        
        if (r1 == 0xffffffff)
            break
        
        sub_d0344(arg1, r1.b)
        r4 += 1
    while (r4 s< arg3)

void* r0_4
char r1_2
char r2
int64_t* pc
r0_4, r1_2, r2 = sub_ce79c(arg1, arg4, 0x121, pc)
return sub_d0a18(r0_4, r1_2, r2) __tailcall
