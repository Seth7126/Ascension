// 函数: _ZN14ascensionrules31CStateProcessDefeatHeroSequence16FindClonePointerEPv
// 地址: 0x159474
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2_3 = *(arg1 + 0x28)

if (r2_3 != 0)
    int32_t entry_r1
    
    if (r2_3 + 0x50 == entry_r1)
        return arg1 + 0x50
    
    if (r2_3 + 0xbc == entry_r1)
        return arg1 + 0xbc

int32_t* r0_2 = *(arg1 + 4)

if (r0_2 == 0)
    return 0

jump(*(*r0_2 + 0x2c))
