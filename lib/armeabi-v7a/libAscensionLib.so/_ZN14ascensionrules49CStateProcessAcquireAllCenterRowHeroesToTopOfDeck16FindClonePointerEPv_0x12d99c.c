// 函数: _ZN14ascensionrules49CStateProcessAcquireAllCenterRowHeroesToTopOfDeck16FindClonePointerEPv
// 地址: 0x12d99c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r3 = *(arg1 + 0x28)

if (r3 != 0)
    int32_t entry_r1
    
    if (r3 + 0x7f8 == entry_r1)
        return arg1 + 0x7f8
    
    int32_t r12_1 = 0x45c
    
    if (r3 + 0x45c == entry_r1)
        return arg1 + 0 + r12_1
    
    if (r3 + 0x4e0 == entry_r1)
        return arg1 + 0x84 + r12_1
    
    if (r3 + 0x564 == entry_r1)
        return arg1 + 2 * 0x84 + r12_1
    
    if (r3 + 0x5e8 == entry_r1)
        return arg1 + 3 * 0x84 + r12_1
    
    if (r3 + 0x66c == entry_r1)
        return arg1 + 4 * 0x84 + r12_1
    
    if (r3 + 0x6f0 == entry_r1)
        return arg1 + 5 * 0x84 + r12_1
    
    if (r3 + 0x774 == entry_r1)
        return arg1 + 6 * 0x84 + r12_1

int32_t* r0 = *(arg1 + 4)

if (r0 == 0)
    return 0

jump(*(*r0 + 0x2c))
