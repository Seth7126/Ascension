// 函数: _ZN14ascensionrules45CStateEachPlayerGainHonorForMechanaConstructs22GainHonorForEachPlayerEv
// 地址: 0x155590
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

CState* entry_r0
int32_t r1 = *(entry_r0 + 0x24c)
ascension::CPlayer* r9 = *(r1 + 4)
int32_t result = *(r9 + 0x18)

if (*(r9 + 0x1c) != result)
    int32_t r6_1 = 0
    
    while (true)
        int32_t r0_3 = ascension::CWorld::GetPlayerByTurnOrder(r9, r1)
        int32_t r0_4 = ascension::CPlayer::CountConstructsInPlay(r0_3, true, nullptr)
        
        if (r0_4 != 0)
            int32_t r10_1 = *(entry_r0 + 0x250)
            void** r0_5 = operator new(0x13c)
            CState::CState()
            *r0_5 = _vtable_for_ascensionrules::CStateGainHonor + 8
            r0_5[0xc] = r0_3
            r0_5[0xd] = r10_1
            r0_5[0xe] = r0_4
            r0_5[0xf].b = 1
            r0_5[0x10] = _vtable_for_ascension::CEventGainHonor + 8
            r0_5[0x11] = 0x1c
            r0_5[0x12] = 0
            r0_5[0x23] = r0_3
            r0_5[0x24] = 0
            r0_5[0x25] = 0
            r0_5[0x26] = 0
            CState::AddOwnedChild(entry_r0)
            CStateList::AppendState(entry_r0)
        
        r6_1 += 1
        result = *(r9 + 0x1c) - *(r9 + 0x18)
        
        if (r6_1 u>= result s>> 2)
            break
        
        r1 = *(entry_r0 + 0x24c)

return result
