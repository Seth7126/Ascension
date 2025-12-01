// 函数: _ZN14ascensionrules40CStateProcessBanishMultipleFromCenterRow10EnterStateER13CStateMachine
// 地址: 0x139268
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0x24c)
*(arg1 + 0x258) = 0
int32_t i = 0
ascension::CPlayer* r6 = *(r0 + 4)

do
    *(arg1 + i + 0x278) = 0
    int32_t r0_3 = ascension::CWorld::GetCenterRowCard(r6)
    
    if (r0_3 == 0)
        *(arg1 + (i << 2) + 0x25c) = 0
    else
        void* r1_3 = arg1 + (i << 2)
        
        if (ascension::CWorld::QueryCanBanish(r6, *(arg1 + 0x24c)) != 0)
            *(r1_3 + 0x25c) = r0_3
        else
            *(r1_3 + 0x25c) = 0
    
    i += 1
while (i != 7)

return ascensionrules::CStateProcessBanishMultipleFromCenterRow::BuildBanishOptions(arg1) __tailcall
