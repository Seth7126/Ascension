// 函数: _ZN14ascensionrules34CStateProcessDefeatMonsterSequence16FindClonePointerEPv
// 地址: 0x158b24
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2_3 = *(arg1 + 0x28)

if (r2_3 != 0)
    int32_t entry_r1
    
    if (r2_3 + 0x54 == entry_r1)
        return arg1 + 0x54
    
    if (r2_3 + 0xc0 == entry_r1)
        return arg1 + 0xc0
    
    if (r2_3 + 0x144 == entry_r1)
        return arg1 + 0x144

int32_t* r0_3 = *(arg1 + 4)

if (r0_3 == 0)
    return 0

jump(*(*r0_3 + 0x2c))
