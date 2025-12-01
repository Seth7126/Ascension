// 函数: _ZN14ascensionrules47CStateProcessAcquireOrDefeatAllCardsInCenterRow16FindClonePointerEPv
// 地址: 0x13086c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r3 = *(arg1 + 0x28)

if (r3 != 0)
    int32_t entry_r1
    
    if (r3 + 0xa80 == entry_r1)
        return arg1 + 0xa80
    
    if (r3 + 0xae8 == entry_r1)
        return arg1 + 0xae8
    
    int32_t r12_1 = 0x6e4
    
    if (r3 + 0x6e4 == entry_r1)
        return arg1 + 0 + r12_1
    
    if (r3 + 0x768 == entry_r1)
        return arg1 + 0x84 + r12_1
    
    if (r3 + 0x7ec == entry_r1)
        return arg1 + 2 * 0x84 + r12_1
    
    if (r3 + 0x870 == entry_r1)
        return arg1 + 3 * 0x84 + r12_1
    
    if (r3 + 0x8f4 == entry_r1)
        return arg1 + 4 * 0x84 + r12_1
    
    if (r3 + 0x978 == entry_r1)
        return arg1 + 5 * 0x84 + r12_1
    
    if (r3 + 0x9fc == entry_r1)
        return arg1 + 6 * 0x84 + r12_1

int32_t* r0_1 = *(arg1 + 4)

if (r0_1 == 0)
    return 0

jump(*(*r0_1 + 0x2c))
