// 函数: _ZN14ascensionrules36CStateProcessDestroyConstructsInPlay16FindClonePointerEPv
// 地址: 0x13d7b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2_3 = *(arg1 + 0x28)
int32_t entry_r1

if (r2_3 != 0 && r2_3 + 0x25c == entry_r1)
    return arg1 + 0x25c

int32_t* r0_1 = *(arg1 + 4)

if (r0_1 == 0)
    return 0

jump(*(*r0_1 + 0x2c))
