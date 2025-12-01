// 函数: _ZN14ascensionrules35CStateAcquireMechanaConstructToHand10EnterStateER13CStateMachine
// 地址: 0x12c6e0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t i = 0
ascension::CPlayer* r6 = *(*(arg1 + 0x24c) + 4)

do
    void* r0_2 = ascension::CWorld::GetCenterRowCard(r6)
    
    if (r0_2 != 0 && *(*(r0_2 + 0xc) + 0x88) == 2
            && ascension::CWorld::QueryCardFaction(r6, *(arg1 + 0x24c), r0_2) != 0)
        int32_t i_1 = i
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_2 + 8), 0xa024, "Acquire %s to Hand", 
            ascensionrules::CStateAcquireMechanaConstructToHand::SelectAcquireToHand)
    
    i += 1
while (i != 7)

*(arg1 + 0x24c)
jump(*(*arg1 + 0x34))
