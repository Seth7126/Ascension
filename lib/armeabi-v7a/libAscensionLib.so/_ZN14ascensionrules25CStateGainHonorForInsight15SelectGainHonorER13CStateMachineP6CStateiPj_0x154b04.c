// 函数: _ZN14ascensionrules25CStateGainHonorForInsight15SelectGainHonorER13CStateMachineP6CStateiPj
// 地址: 0x154b04
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6 = *(arg2 + 0x254)
ascension::CPlayer* r9 = *(arg2 + 0x24c)

if (r6 s>= 1)
    void* r7_1 = *(r9 + 4)
    
    if (zx.d(*(r7_1 + 0xb3d)) == 0)
        ascension::CPlayer::RemoveInsightCount(r9)
    else
        uint32_t r1 = zx.d(*(r7_1 + 0xb29))
        uint32_t r0_1 = r1
        
        if (r1 != 0)
            r0_1 = 8
        
        if (*(r7_1 + 0xb48) s<= 0 && (r1 == 0 || *(r7_1 + 0xb40) s< 1))
            ascension::CPlayer::RemoveInsightCount(r9)
        else
            ascensionrules::CreateStateMustPayResources(r9, *(arg2 + 0x258), 0, 0, r6, r0_1, 8, 0)
            CState::AddOwnedChild(arg2)
            CStateList::AppendState(arg2)
            
            if (*(r7_1 + 0x30) u<= 0x17)
                ascension::CPlayer::RemoveInsightCount(r9)

int32_t r7_2 = *(arg2 + 0x250)
int32_t r5 = *(arg2 + 0x258)
int32_t* r0_8 = operator new(0x13c)
CState::CState()
*r0_8 = _vtable_for_ascensionrules::CStateGainHonor + 8
r0_8[0xc] = r9
r0_8[0xd] = r5
r0_8[0xe] = r7_2
r0_8[0xf].b = 0
r0_8[0x10] = _vtable_for_ascension::CEventGainHonor + 8
r0_8[0x11] = 0x1c
r0_8[0x12] = 0
r0_8[0x23] = r9
r0_8[0x24] = 0
r0_8[0x25] = 0
r0_8[0x26] = 0
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
