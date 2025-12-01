// 函数: sub_db000
// 地址: 0xdb000
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r5 = arg1
void* r4 = arg2
int32_t r1 = *(arg2 + 0x10)

if (r1 != &data_1d1540)
    r4, r5 = sub_d14cc(r5, r1, 0x20 << zx.d(*(r4 + 7)), 0)

int32_t r4_1
int32_t* r5_1
r4_1, r5_1 = sub_d14cc(r5, *(r4 + 0xc), *(r4 + 0x1c) << 4, 0)
return sub_d14cc(r5_1, r4_1, 0x20, 0) __tailcall
