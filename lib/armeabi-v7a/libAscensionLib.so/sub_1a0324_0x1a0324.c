// 函数: sub_1a0324
// 地址: 0x1a0324
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r6 = *arg1

if (*r6 == 0)
    *r6 = arg2
else
    void* r0_3 = sub_19fbde(arg1[1] + 0x170, 0x10)
    int32_t r3_1 = *r6
    *r0_3 = &_vtable_for_(anonymous namespace)::NestedName{for `(anonymous namespace)::Node'}
    *(r0_3 + 4) = 0x1010118
    *(r0_3 + 8) = r3_1
    *(r0_3 + 0xc) = arg2
    **arg1 = r0_3

void* result = *arg1[2]

if (result != 0)
    *(result + 1) = 0

return result
