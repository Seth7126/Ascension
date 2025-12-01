// 函数: sub_c4608
// 地址: 0xc4608
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r3 = *arg2

if (r3 != 0xd)
    if (r3 != 0xc)
        return 
    
    int32_t r12 = arg2[2]
    int32_t r0_1 = *(*arg1 + 0xc)
    *(r0_1 + (r12 << 2)) =
        (*(r0_1 + (r12 << 2)) & 0xff803fff) | ((0x4000 + (arg3 << 0xe)) u>> 0xe & 0x1ff) << 0xe
    return 

void* r12_1 = *arg1
int32_t lr = arg2[2]
int32_t r3_3 = *(r12_1 + 0xc)
*(r3_3 + (lr << 2)) = (*(r3_3 + (lr << 2)) & 0x7fffff) | (arg3 + 1) << 0x17
int32_t r1_2 = arg2[2]
uint32_t r2_2 = zx.d(arg1[0xc].b)
*(r3_3 + (r1_2 << 2)) = (*(r3_3 + (r1_2 << 2)) & 0xffffc03f) | r2_2 << 6

if (r2_2 u>= zx.d(*(r12_1 + 0x4e)))
    if (r2_2 u>= 0xf9)
        int32_t* r0_3
        int32_t* r1_4
        int64_t* pc
        r0_3, r1_4 = sub_ce78c(arg1[3], "function or expression too complex", pc)
        return sub_c46bc(r0_3, r1_4) __tailcall
    
    *(r12_1 + 0x4e) = r2_2.b + 1

arg1[0xc].b = r2_2.b + 1
