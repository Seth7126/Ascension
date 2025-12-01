// 函数: sub_1a4fd8
// 地址: 0x1a4fd8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0 = *(arg1 + 8)
(*(*r0 + 0xc))(r0, arg2)

if (sub_1a094e(*(arg1 + 8), arg2) != 0)
    sub_19fca4(arg2, &data_1d04ba, 0x1d04bb)

uint32_t r0_5 = sub_1a094e(*(arg1 + 8), arg2)
uint32_t r0_7

if (r0_5 == 0)
    r0_7 = sub_1a0962(*(arg1 + 8), arg2)

void* const r1_5
void* const r2_1

if (r0_5 == 0 && r0_7 == 0)
    r1_5 = &data_1cfec3
    r2_1 = &data_1cfec5
else
    r1_5 = &data_1d0655
    r2_1 = &data_1d0658

return sub_19fca4(arg2, r1_5, r2_1) __tailcall
