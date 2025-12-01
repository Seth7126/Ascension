// 函数: _ZN14ascensionrules14BanishThisCardEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x1122a4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (arg5 == 0)
    return 

uint32_t r0_1 =
    __dynamic_cast(arg5, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)

if (r0_1 == 0)
    void* r0_6 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
        _typeinfo_for_ascension::CConstructInstance, 0)
    void* r7_5 = r0_6
    
    if (r0_6 == 0)
        arg1 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
            _typeinfo_for_ascension::CConstructAbilityInstance, 0)
        
        if (arg1 != 0)
            r7_5 = *(arg1 + 0xc)
            
            if (r7_5 != 0)
                goto label_112398
    else
    label_112398:
        uint32_t r5_1 = *(r7_5 + 0x10)
        ascension::CConstructInstance* r6_2 = *(r7_5 + 0xc)
        
        if (ascension::CWorld::IsResolveEffect(arg2) == 0)
            int32_t var_28_2 = 0
            ascension::CWorld::OutputAnimationCard(arg2, r5_1, 6, 4, zx.d(*(r7_5 + 8)), 9, 0, 
                &__elf_header)
        else
            int32_t var_28_1 = 0
            ascension::CWorld::OutputAnimationCard(arg2, r5_1, 6, 0xb, 0, 9, 0, &__elf_header)
            ascension::CWorld::RemoveResolveEffect(arg2)
        
        if (ascension::CPlayer::RemoveConstructFromPlay(r6_2) != 0)
            if (r6_2 == *(arg2 + 0xb20))
                ascension::CWorld::AddToBanishedCardCount()
            
            ascension::CPlayer::RemoveOwnedCard(r6_2)
            ascension::CWorld::PutCardInVoid(arg2)
            ascension::CPlayer::AddTurnLog(r6_2, 6)
            return core::CWorldBase::OutputMessageFormat(arg2, "%s banishes %s from play\n", 
                (*(*r6_2 + 0xc))(r6_2), (*(*r5_1 + 0xc))(r5_1)) __tailcall
else
    if (arg6 != 0)
        void* r1_2 = arg6 + *arg6 + 4
        uint32_t r0_3 = zx.d(*r1_2)
        
        if (r0_3 u<= 7)
            uint32_t r2_1 = zx.d(*(r0_1 + 8))
            *r1_2 = r0_3.b + 1
            *(arg6 + (*arg6 << 5) + (r0_3 << 2) + 0x10) = r2_1
    
    arg1 = *(arg2 + 0xbd8)
    int32_t r1_5 = *(arg2 + 0xbdc)
    void* r2_2 = r1_5 - arg1
    int32_t r3_2
    
    if (r1_5 != arg1)
        int32_t r1_6 = r2_2 s>> 3
        int32_t r3_1 = 0
        
        while (true)
            if (*(arg1 + (r3_1 << 3)) == r0_1 && *(arg1 + (r3_1 << 3) + 4) == 7)
                r3_2 = 0
                break
            
            r3_1 += 1
            
            if (r3_1 u>= r1_6)
                r3_2 = 1
                break
        
        if (*(arg2 + 0x30) u>= 0x17 && r2_2 != 0)
            int32_t r2_8 = 0
            
            do
                if (*(arg1 + (r2_8 << 3)) == r0_1 && *(arg1 + (r2_8 << 3) + 4) == 4)
                    return 
                
                r2_8 += 1
            while (r2_8 u< r1_6)
    
    if (r1_5 == arg1 || r3_2 != 0)
        if (*(arg2 + 0xb20) == arg3)
            ascension::CWorld::AddToBanishedCardCount()
        
        ascension::CPlayer::RemoveOwnedCard(arg3)
        ascension::CWorld::PutCardInVoid(arg2)
        ascension::CWorld::OutputPauseForAnimationToDestination(arg2)
        int32_t var_28_3 = 0
        ascension::CWorld::OutputAnimationCard(arg2, r0_1, 6, 0xb, 0, 9, 0, &__elf_header)
        ascension::CWorld::SetPlayedCardsFlags(arg2, r0_1)
        return ascension::CPlayer::AddTurnLog(arg3, 6) __tailcall
